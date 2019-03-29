package proxy.dynamicProxy2;

public class RealSubject implements Subject {
    public void doAction(String str) {
        System.out.println(str);
    }
}
