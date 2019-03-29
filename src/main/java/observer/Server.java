package observer;

import java.util.ArrayList;
import java.util.List;

public class Server implements Observerable {

    private List<Observer> list;
    private String message;

    public Server() {
        this.list = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : list) {
            o.update(message);
        }
    }

    public void setMsg(String msg) {
        System.out.println("服务器发送消息：" + msg);
        this.message = msg;
        notifyObserver();
    }
}
