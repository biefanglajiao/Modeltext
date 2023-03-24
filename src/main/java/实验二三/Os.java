package 实验二三;

import java.util.Random;

public class Os {
    public int load() {
        //0,1随机数
//        return ((int) (10 * Math.random())) % 2;//0,1

        Random a=new Random();
        int n6 = a.nextInt(20);
        int m1 = 9;
        if(n6 < 5){
            m1 = 0;
        }else {
            m1 = 1;
        }
        System.out.println("os"+m1);
        return m1;
    }
}
