package 实验四二;

/**
 * @Author: 常兆海
 * @Description:（1）案例背景： 某会议管理系统的“会议通知发送”模块说明如下：
 * （1）行政管理人员可以给某个或者某些员工（Employee）发送会议通知，也可以给某个部门
 * （Department）发送通知，如果给某个部门发送通知，将逐个给该部门每个员工发送会议通知。
 * （2）如果员工或者部门希望能够收到会议通知，必须先注册到一个会议列表（MeetingList）中，
 * 在发送通知时，系统将遍历会议列表，逐个将会议通知发送给注册用户（User）。
 * @设计模式选用： 组合模式         叶子节点员工  叶片 部门
 * @DateTime: 2023/4/8 12:42
 **/
public class Client {

    public static void main(String[] args) {
        MySubject meetingList = new MeetingList();

        User user1, user2, user3, user4, user5, users1, users2;
        users1 = new Department();
        users2 = new Department();

        user1 = new Employee();
        user2 = new Employee();
        user3 = new Employee();
        user4 = new Employee();
        user5 = new Employee();

        users1.add(user1);
        users1.add(user2);
        users1.add(user3);
        users2.add(user4);
        users2.add(user5);

        meetingList.attach(users1);//向部门1发送通知

        meetingList.attach(users2);//向部门2发送通知

        meetingList.attach(user3);//向员工3发送通知

        meetingList.meeting();//通过观察者模式实现：如果员工或者部门希望能够收到会议通知，必须先注册到一个会议列表（MeetingList）中， 在发送通知时，系统将遍历会议列表，逐个将会议通知发送给注册用户（User）

    }
}
