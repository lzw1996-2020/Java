package day05.part02;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}
