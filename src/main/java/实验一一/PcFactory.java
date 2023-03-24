package 实验一一;

public class PcFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        System.out.println("PcFactroy创建PC的CPU");
        return  new PcCpu();
    }

    @Override
    public Ram createRam() {
        System.out.println("PcFactroy创建PC的RAM");
        return new PcRam();
    }
}
