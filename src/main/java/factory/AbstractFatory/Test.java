package factory.AbstractFatory;

public class Test {
    public static void main(String[] args) {
        Factory hisense = new Hisense();
        hisense.createTV();
        Factory haier = new Haier();
        haier.createAirCon();
    }
}
