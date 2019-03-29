package decorator;

public class WritePom extends Write{
    private Person persion;
    public WritePom (Person p){
        this.persion = p;
    }
    public void Skill() {
        persion.Skill();
        System.out.println("write a pom");
    }
}
