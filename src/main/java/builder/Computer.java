package builder;

public class Computer {
    private int cpu;
    private int memory;
    private int hardDisk;
    private Boolean dvd;
    private int display;

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Boolean getDvd() {
        return dvd;
    }

    public void setDvd(Boolean dvd) {
        this.dvd = dvd;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }
}
