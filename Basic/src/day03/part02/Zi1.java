package day03.part02;

public class Zi1 extends Fu{
    int num = 10;
    public void method() {
        int num = 20;
        System.out.println(num);//方法自定义的变量
        System.out.println(this.num);//本类的成员变量
        System.out.println(super.num);//父类的成员变量
    }
}
