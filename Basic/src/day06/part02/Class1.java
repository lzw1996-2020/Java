package day06.part02;

public class Class1 {
    int num = 10;//这个是有final
//    num = 40;//错误
    public void method() {
        int num = 20;
        class Class11 {
            int num = 30;
        }
        Class11 class11 = new Class11();
        System.out.println(class11.num);
        System.out.println(num);
        System.out.println(this.num);
    }
}
