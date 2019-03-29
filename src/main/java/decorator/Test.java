package decorator;

public class Test {
    public static void main(String a[]){
        Person p = new Programer();
        p = new SingSong(p);
        p = new WritePom(p);
        p.Skill();
    }
}
