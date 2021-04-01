package day05.part02;

public class Main {
    public static void main(String[] args) {
        //向上转型
        Animal animal = new Cat();
        animal.eat();
//        animal.catchMouse();//错误写法
//        向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫捉老鼠
        cat.eat();//吃鱼



        if(animal instanceof Cat) {
            System.out.println("猫");
        }

        if(animal instanceof Dog) {
            System.out.println("狗");
            Dog dog = (Dog) animal;
        }
    }
}
