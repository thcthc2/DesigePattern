package factory.AbstractFatory;

public class Hisense implements Factory {

    public TV createTV() {
        return new HisenseTV();
    }

    public AirConditioning createAirCon() {
        return new HisenseCond();
    }
}
