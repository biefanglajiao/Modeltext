package 实验一三;

public class Multiton {

 private  volatile static Multiton multiton1=null;
    private  volatile static Multiton multiton2=null;



private Multiton() {}




    public static   synchronized int random() {

    //随机数的值为1-2
    int random = (int) (Math.random() *(2-1+1) + 1);//Math.random()*(max-min+1)+min
        System.out.println(random);
    return random;
}




    public static   Multiton getInstance(int random){  //不能乱改名字 这个是特定方法名
       if (random==1){
           if (multiton1==null)
               synchronized (Multiton.class) {
                   if (multiton1==null)
                       multiton1 = new Multiton();
               }
           return multiton1;
       }
       else {
           if (multiton2==null)
               synchronized (Multiton.class) {
                   if (multiton2==null)
                       multiton2 = new Multiton();
               }
           return multiton2;
       }
    }
}
