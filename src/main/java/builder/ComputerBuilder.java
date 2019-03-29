package builder;

public class ComputerBuilder implements Builder {
    Computer computer = new Computer();

    public void setCpu(int cpu) {
        computer.setCpu(cpu);
    }

    public void setMemory(int memory) {
        computer.setMemory(memory);
    }

    public void setHardDisk(int hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    public void setDvd(boolean dvd) {
        computer.setDvd(dvd);
    }

    public void setDisplay(int display) {
        computer.setDisplay(display);
    }

    public Computer returnComputer() {
        return computer;
    }
}
