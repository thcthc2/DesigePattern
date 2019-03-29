package factory.AbstractFatory;

public class Haier implements Factory {

    public TV createTV() {
        return new HaierTV();
    }

    public AirConditioning createAirCon() {
        return new HaierCond();
    }
}
