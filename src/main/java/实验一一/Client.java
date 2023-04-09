package 实验一一;

/***
 * 1. 抽象工厂模式的运用
 * （1）案例背景：
 * 计算机包含内存（RAM），CPU 等硬件设备，根据如图所示的“产品等级结构-产品族示意图”，使用
 * 抽象工厂模式实现计算机设备创建过程并绘制类图（课本 105 页第二题）
 * （2）实现步骤：
 *  根据题意，使用抽象工厂模式并画出类图，类图中应包含一个抽象工厂类 AbstractFactory，
 * PcFactory 和 MacFactory 两个具体工厂，CPU，RAM 两个抽象产品类，PcCPU，MacCPU，
 * PcRAM，MacRAM 四个具体产品类。
 *  根据类图，实现上述类的具体代码以及用户类 Client 和辅助类 XMLUtil 以实现通过 XML 文
 * 件来制造不同的产品
 *  更改 XML 中的属性，观察用户类是否能使用不同的产品
 */
public class Client {
    public static void main(String[] args) {

        AbstractFactory factory;
        Cpu cpu;
        Ram ram;
        factory = (AbstractFactory) XmlUtil.getbBean();
        cpu = factory.createCpu();
        cpu.calculate();
        ram = factory.createRam();
        ram.storage();
    }
}
