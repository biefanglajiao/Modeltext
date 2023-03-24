package 实验一二;

public class Server extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("CPU");

    }

    @Override
    public void buildRam() {
        computer.setRam("RAM");

    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("HardDisk");
    }

    @Override
    public void buildHost() {
        computer.setHost("Host");
    }

    @Override
    public void builddisplay() {//空方法 返回为空
    }
}
