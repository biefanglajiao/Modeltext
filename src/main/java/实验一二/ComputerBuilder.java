package 实验一二;

public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract void buildCpu();

    public abstract void buildRam();
    public abstract void buildHardDisk();
    public abstract void buildHost();
    public abstract void builddisplay() ;

    public Computer getComputer() {
        return computer;
    }


}
