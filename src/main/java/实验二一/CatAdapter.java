package 实验二一;

public class CatAdapter  implements Cat{


    @Override
    public void cry() {
        System.out.println("Cat cry");

    }

    @Override
    public void catchmouse() {
        System.out.println("Cat catchmouse");
    }


}
