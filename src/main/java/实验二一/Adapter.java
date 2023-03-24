package 实验二一;

public class Adapter implements Cat, Dog{

    private Cat cat;
    private Dog dog;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void cry() {
        System.out.print("猫学");
dog.wang();
    }

    @Override
    public void catchmouse() {
cat.catchmouse();
    }

    @Override
    public void wang() {
dog.wang();
    }

    @Override
    public void action() {
        System.out.print("狗学");
   cat.catchmouse();
    }
}
