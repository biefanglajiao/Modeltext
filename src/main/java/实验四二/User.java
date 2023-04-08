package 实验四二;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 22:13
 **/
public abstract class User {

    public void  add(User user){};
    public  void  remove(User user){};
    public   User getchild(int i){return null;};
    public abstract void  action();
}
