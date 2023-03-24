package 实验一三;

/**
 * 3. 单例模式的运用
 * （1）案例背景：
 * 在实际的运用中，我们有时一个类不止需要产生一个对象，可能需要两个或者三个。在课上我们讲过，
 * 使用单例模式的思想可以实现多例模式，从而确保系统中某个类的对象只能存在有限个，请设计并实现代
 * 码，从而实现多例模式
 * （2）实现步骤：
 *  由于本题的实现较为复杂，所以我们直接给出参考类图（见下一页）
 *  根据类图，实现多例模式的代码
 */
public class Client {
    public static void main(String[] args) {

        Multiton multiton1 = Multiton.getInstance( Multiton.random());
        Multiton multiton2 = Multiton.getInstance( Multiton.random());
        Multiton multiton3 = Multiton.getInstance(  Multiton.random());
        System.out.println(multiton1==multiton2);
        System.out.println(multiton1==multiton3);
        System.out.println(multiton2==multiton3);
    }
}
