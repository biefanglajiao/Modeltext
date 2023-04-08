package 实验三三;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/7 10:38
 *
 **/
public class AirplaneStrategy
implements  TravelStrategy{
    @Override
    public void travel() {
        System.out.println("坐飞机");
    }
}
