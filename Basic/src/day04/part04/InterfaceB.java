package day04.part04;

public interface InterfaceB {
    public abstract void methodA1();

    public abstract void methodB1();

    public default void methodDefault() {
        System.out.println("BBB");
    }

    public default void methodCommon() {
        System.out.println("接口B的默认方法");
    }
}
