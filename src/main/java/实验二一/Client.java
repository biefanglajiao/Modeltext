package 实验二一;

/****
 * . 适配器模式的运用
 * （1）案例背景：
 * 在课堂上我们学习了单向适配器的使用和实现，现在我们需要实现一个双向适配器，编写代码，使用
 * Java 语言实现双向适配器，使猫可以学狗叫，狗可以学猫抓老鼠，请绘制相应类图并实现。（课本 167 页
 * 第三题）
 * （2）实现步骤：
 *  根据题意，画出双向适配器的类图，类图中应该包含一个适配器类 Adapter；两个抽象类 Cat
 * 类和 Dog 类，Cat 类中有发出叫声的方法 cry（）和捉老鼠的方法 catchMouse（），Dog 类
 * 中有发出狗叫声的方法 wang（）和动作方法 action（）；两个具体适配者类 ConcreteCat 类
 * 和 ConcreteDog 类，两个抽象类互为抽象目标和抽象适配者，如果客户端针对 Cat 类编程，
 * 则 Cat 类充当抽象目标，Dog 类充当抽象适配者，ConcreteCat 类充当具体适配者，反之同理。
 *  根据类图，实现上述类的具体代码以及用户类 Client，由于本题中只有一个适配器类 Adapter，
 * 所以不需要通过 XML 文件来改变用户类的操作
 *  编译并运行代码，观察是否能让猫发出狗叫声和让狗实现抓老鼠的动作。
 */
public class Client {
    public static void main(String[] args) {
        //必须要把猫狗都实例化出来 不然会报空指针异常！！！
        Cat cat = new CatAdapter();
        Dog dog = new DogAdapter();

        Adapter adapter = new Adapter();
        adapter.setCat(cat);
        cat = adapter;


        adapter.setDog(dog);
        cat.cry();
        cat.catchmouse();
        dog = adapter;
        dog.wang();
        dog.action();


    }
}
