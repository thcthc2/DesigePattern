package singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import decorator.Sing;

public class Singleton {

    //懒汉式，线程不安全
//    private static Singleton singleton = null;
//    private  Singleton(){
//    }
//    public static Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    //懒汉式，线程安全
//    private static Singleton singleton = null;
//    private Singleton (){}
//    public static synchronized Singleton getInstance(){
//        if(null == singleton){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    //饿汉式，线程安全
//    private static Singleton singleton = new Singleton();
//    private static Singleton getInstance(){
//        return singleton;
//    }

    //静态内部类,不能传递外部参数
//    private static class SingletonHolder{
//        private static Singleton singleton = new Singleton();
//    }
//    private static Singleton getInstance(){
//        return SingletonHolder.singleton;
//    }

    //双重校验
    private static volatile Singleton singleton;
    private Singleton (){}
    private Singleton getSingleton(){
        if(null == singleton){
            synchronized (Singleton.class){
                if(null == singleton)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }
}
