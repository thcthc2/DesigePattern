package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //创建一个被代理者
        Subject realSubject = new RealSubject();
        //创建一个InvocationHandler，描述我们希望代理者执行哪些操作
        InvocationHandler invocationHandler = new DynamicProxy(realSubject);
        //通过刚才创建的InvocationHandler，创建真正的代理者。第一个参数是类加载器，第二个参数是这个代理者实现哪些接口
        Subject subject = (Subject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), invocationHandler);
        subject.doAction("唱歌");
    }

}
