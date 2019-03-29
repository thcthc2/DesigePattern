package factory.FactoryMethod;

public class Test {
    public static void main(String s[]){
        BMW320Factory factory = new BMW320Factory();
        Product product = factory.getProduct();
        product.create();
    }
}
