package 实验二一;

public class DogAdapter  implements Dog{
    @Override
    public void action() {
        System.out.println("Dog action");

    }

    @Override
    public void wang() {
        System.out.println("Dog wang");
    }

}
