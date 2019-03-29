package proxy.dynamicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //创建一个被代理者
        Subject realSubject = new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy();
        Subject subject = (Subject) dynamicProxy.bind(realSubject);
        subject.doAction("唱歌");
    }
}
