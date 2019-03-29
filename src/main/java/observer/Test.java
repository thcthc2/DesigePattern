package observer;

public class Test {
    public static void main(String[] args) {
        Observer ob = new User("张三");
        Observer ob1 = new User("李四");
        Observer ob2 = new User("王五");

        Observerable observerable = new Server();
        observerable.addObserver(ob);
        observerable.addObserver(ob1);
        observerable.addObserver(ob2);

        ((Server) observerable).setMsg("java是世界上最好的语言");
        System.out.println("-------------------------");

        observerable.removeObserver(ob1);
        ((Server) observerable).setMsg("php是世界上最好的语言");

    }
}
