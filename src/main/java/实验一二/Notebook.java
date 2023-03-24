package 实验一二;

public class Notebook extends ComputerBuilder {

    @Override
    public void buildCpu() {
       computer.setCpu("Notebook CPU");
    }

    @Override
    public void buildRam() {
        computer.setRam("Notebook RAM");

    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("Notebook HardDisk");

    }

    @Override
    public void buildHost() {
       computer.setHost("Notebook Host");
    }

    @Override
    public void builddisplay() {
        computer.setDisplay("Notebook 显示器");
    }
}


