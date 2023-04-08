package 实验四二;

import java.util.ArrayList;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 22:19
 **/
public class Department extends User{
    private ArrayList list=new ArrayList();
    @Override
    public void add(User user) {
        list.add(user);}

    @Override
    public void remove(User user) {
       list.remove(user);
    }

    @Override
    public User getchild(int i) {
      return (User) list.get(i);
    }

    @Override
    public void action() {
        System.out.println("某些部门（Department）发送会议通知，");
        for (Object o : list
             ) {
            ((User) o).action();
        }
    }
}
