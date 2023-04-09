package 实验四二;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 22:25
 **/
public class MeetingList extends MySubject {


    @Override
    public void meeting() {

        for (Object o : observes
        ) { System.out.println("软件2028班  常兆海202007657 的会议1安排");
            ((User) o).action();
        }
    }

}

