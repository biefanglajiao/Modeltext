package 实验二三;

/**
 * 外观模式的运用
 * （1）案例背景：
 * 在计算机主机（Mainframe）中，只需要按下主机的开机按钮（on（）），即可调用其他硬件设备和
 * 软件的启动方法，如内存（Memory）的自检（check（））、CPU 的运行（run（））、硬盘的（HardDisk）
 * 的读取（read（））、操作系统（OS）的载入（load（））等，如果某一过程发生错误则计
 * 算机启动失败。使用外观模式模拟该过程，绘制类图并编程实现。（课本 230 页第二题）
 * （2）实现步骤：
 *  根据题意，画出外观模式的类图，使主机类 Mainframe 充当外观角色，内存类 Memory，
 * CPU 类 CPU，硬盘类 HardDisk 和操作系统类 OS 充当子系统角色
 *  根据类图，编写并实现代码
 *  编译并运行代码，使代码能够输出模拟出来的电脑开机过程
 */
public class Client
{
    public static void main(String[] args) {
        Mainframe   mainframe=new Mainframe();
        mainframe.run();
    }
}
