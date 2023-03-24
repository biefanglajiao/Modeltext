package 实验一一;

public class MacFactory
implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        System.out.println("MacFactory创建Mac的CPU");
        return new MacCpu();
    }

    @Override
    public Ram createRam() {
        System.out.println("MacFactory创建Mac的RAM");
        return new MacRam();
    }
}
