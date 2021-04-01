package day06.part01;
//内部类
public class Demo01 {
    public void method() {
        System.out.println("方法1");
        new Inside().method();
    }

    public class Inside {
        public void method() {
            System.out.println("内部类方法");
        }
    }
}
