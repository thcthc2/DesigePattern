package builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public Computer getComputer(int cpu,int memory,int hardDisk,int display,boolean dvd){
        builder.setCpu(cpu);
        builder.setMemory(memory);
        builder.setHardDisk(hardDisk);
        builder.setDisplay(display);
        builder.setDvd(dvd);
        return builder.returnComputer();
    }

}
