package observer;

public class User implements Observer {
    public String name;
    public String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    void read() {
        System.out.println(name + "接收到消息：" + message);
    }
}
