package 实验三三;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/7 10:39
 *
 **/
public class Client {
    public static void main(String[] args) {

        Person person = new Person();
       TravelStrategy tra= (TravelStrategy) Xmlutil.getbBean();
        person.setTravelStrategy(tra);
        person.travel();
    }
}
