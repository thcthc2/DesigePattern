package observer;

public interface Observerable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    void notifyObserver();
}
