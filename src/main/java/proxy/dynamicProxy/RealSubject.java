package proxy.dynamicProxy;

public class RealSubject implements Subject {
    public void doAction(String str) {
        System.out.println(str);
        ;
    }
}
