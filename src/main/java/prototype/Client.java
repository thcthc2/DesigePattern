package prototype;

public class Client {
    public static void main(String[] args) {

        Prototype prototype = new ConcreatePrototype();
        ConcreatePrototype concreatePrototype = (ConcreatePrototype) prototype.clone();
        concreatePrototype.listen();
    }
}
