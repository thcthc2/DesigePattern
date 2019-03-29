package factory.SimpleFactory;

public class Test {
    public static void main(String s[]){
        Product product = Factory.createBMW("520");
        product.create();
    }
}
