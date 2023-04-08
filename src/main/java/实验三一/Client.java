package 实验三一;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 10:01
 **/
public class Client {
    public static void main(String[] args) {
        TV tv;
        TVIterator tvIterator;
        tv = (TV) Xmlutil.getbBean();
        tvIterator = tv.tvIterator();
        System.out.println("电视机频道：");
        while (!tvIterator.isLast()) {
            System.out.println(tvIterator.currentChannel().toString());
            tvIterator.next();
        }
    }
}
