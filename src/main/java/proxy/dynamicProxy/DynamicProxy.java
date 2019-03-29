package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    //目标对象的引用，这里设计成Object类型，更具通用性
    private Object subject;

    public DynamicProxy(Object subject) {
        this.subject = subject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("喝水");
        //调用目标对象的方法
        Object ob = method.invoke(subject, args);
        System.out.println("谢谢");
        return ob;
    }
}
