package decorator;

public class SingSong  extends Sing{
    private Person person;
    public SingSong(Person p){
        this.person = p;
    }
    public void Skill() {
        person.Skill();
        System.out.println("sing a song");
    }
}
