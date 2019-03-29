package builder;

public class Test {
    public static void main(String[] args) {
        //为什么在客户端创建具体建造者而不是在导演创建的原因是：
        //为了将导演者对象同具体建造者对象的耦合变成动态的，从而使得导演者对象可以操作多个具体建造者对象中的任何一个。
        Builder builder = new ComputerBuilder();
        Director director = new Director(builder);
        Computer computer = director.getComputer(12,122,2121,12,false);
        System.out.println("电脑的cpu为："+computer.getCpu());
    }
}
