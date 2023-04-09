package 实验一二;

/**
 * 2.建造者模式的运用
 * （1）案例背景：
 * 计算机组装工厂可以将 CPU，内存，硬盘，主机，显示器等硬件设备组装在一起构成一台完整的计算
 * 机，且构成的计算机可以是笔记本电脑，也可以是台式机，还可以是不提供显示器的服务器主机。对于用
 * 户来言，无需关心计算机的组成设备和组装过程，工厂返回给用户的是完整的计算机对象。所以我们可以
 * 使用建造者模式来实现计算机的组成过程，请绘制出类图并编程实现
 * （2）实现步骤：
 *  根据题意，使用建造者模式并画出类图。类图中应包含抽象建造者类 ComputerBuilder，复合产品
 * 类 Computer，具体建造者类 Notebook，Desktop 和 Server，其中台式机和服务器主机使用相同的
 * CPU，内存，硬盘和主机，但是服务器不包含显示器，而笔记本使用自己独自的一套硬件设备。
 * 此外还需要指挥者类 ComputerAssembleDirector，此类中应有将硬件设备组合在一起的建造方法
 * assemble()并返回用户需要的具体计算机
 *  根据类图，实现上述类的具体代码以及用户类 Client 和辅助类 XMLUtil 以实现通过 XML 文件来
 * 制造不同的计算机
 *  更改 XML 中的属性，观察用户类是否能够获取到不同的计算机以及这些计算机的组装是否符合
 * 要求
 * （3）案例总结：
 */
public class Client {
    public static void main(String[] args) {
        ComputerBuilder builder= (ComputerBuilder) XmlUtil.getbBean();

ComputerAssembleDirector director=new ComputerAssembleDirector(builder);
        Computer computer=director.assemble();
        System.out.println(computer.getCpu());
        System.out.println(computer.getRam());
        System.out.println(computer.getHardDisk());
        System.out.println(computer.getHost());
        System.out.println(computer.getDisplay()
        );
    }
}
