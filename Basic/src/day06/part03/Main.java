package day06.part03;

public class Main {
    public static void main(String[] args) {
        Interface obj = new InterfaceClass();
        obj.method();

//        匿名内部类
        Interface obj1 = new Interface() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
                System.out.println(num);//10
            }
        };
        obj1.method();
    }
}
