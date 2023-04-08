package 实验三三;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/7 10:37
 *
 **/
public class Person {
    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }
    public void travel(){
        travelStrategy.travel();
    }
}
