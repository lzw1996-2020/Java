package day04.part03;
//默认方法
//接口当中也有“成员变量”，但是必须使用public static final修饰
//相当于常量
public interface InterfaceDefault {
    public static final int NUM = 0;

    public default void defaultMethod() {
        System.out.println("默认方法");
        this.methodPrivate();
    }
//    抽象方法
    public abstract void absMethod();

    public static void staticMethod() {
        System.out.println("静态方法");
        methodStaticPri();
    }

    private void methodPrivate() {
        System.out.println("私有方法");
    }

    private static void methodStaticPri() {
        System.out.println("静态私有方法");
    }


}
