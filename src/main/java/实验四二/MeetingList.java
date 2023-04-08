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
        ) { System.out.println("会议1安排");
            ((User) o).action();
        }
    }
    public void meeting2() {

        for (Object o : observes
        ) { System.out.println("会议2安排");
            ((User) o).action();
        }
    }
}

