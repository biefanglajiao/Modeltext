package 实验四二;

import java.util.ArrayList;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 22:32
 **/
public abstract class MySubject {
    protected ArrayList observes=new ArrayList();
    //注册
    public  void attach(User observer){
        observes.add(observer);
    }
    public void detach(User observer){
        observes.remove(observer);
    }
    public abstract void meeting();
}
