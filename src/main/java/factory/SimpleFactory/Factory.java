package factory.SimpleFactory;

public class Factory {
    public static Product createBMW(String s){
        Product p = null;
        if ("320".equals(s)) {
            p = new BMW320();
        }
        else if("520".equals(s)){
            p = new BMW520();
        }
        return p;
    }
}
