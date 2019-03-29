package factory.FactoryMethod;

public class BMW520Factory implements Factory {
    public Product getProduct() {
        return new BMW520();
    }
}
