package factory.FactoryMethod;

public class BMW320Factory implements Factory {
    public Product getProduct() {
        return new BMW320();
    }
}
