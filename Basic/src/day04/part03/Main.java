package day04.part03;
//不能通过接口实现类的对象调用接口当中的静态方法！！！
//正确用法：通过接口名称.静态方法直接调用
public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.absMethod();
        class1.defaultMethod();
        InterfaceDefault.staticMethod();
    }
}
