package builder;

public interface Builder {
    void setCpu(int cpu);
    void setMemory(int memory);
    void setHardDisk(int hardDisk);
    void setDvd(boolean dvd);
    void setDisplay(int display);
    Computer returnComputer();
}
