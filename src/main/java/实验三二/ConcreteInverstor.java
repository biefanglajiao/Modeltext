package 实验三二;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 10:15
 **/
public class ConcreteInverstor implements Inverstor{
    @Override
    public void upDate() {
        System.out.println("股票价格发生变化");
    }
}
