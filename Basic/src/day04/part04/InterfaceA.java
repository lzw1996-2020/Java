package day04.part04;

public interface InterfaceA {
    public abstract void methodA1();
    public default void methodDefault() {
        System.out.println("AAA");
    }
//    父类方法与接口方法重名是使用父类方法，实现类不需要重写接口的抽象方法
//    public abstract void method();

    public default void method() {
        System.out.println("接口的方法");
    }

    public default void methodCommon() {
        System.out.println("接口A的默认方法");
    }
}
