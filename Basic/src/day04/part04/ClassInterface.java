package day04.part04;

public class ClassInterface extends ClassFather implements InterfaceA,InterfaceB{
    @Override
    public void methodA1() {
        System.out.println("接口A的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("接口实现类的默认方法");
    }

    @Override
    public void methodCommon() {
        System.out.println("实现类重写的");
    }

    @Override
    public void methodB1() {
        System.out.println("接口B的抽象方法");
    }
}
