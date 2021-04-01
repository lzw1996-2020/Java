package day05.part01;
//多态
public class Demo01 {
    public static void main(String[] args) {
        Fu fu = new Zi();
        fu.method();//子类重写父类的方法
        fu.methodFu();//父类特有的方法

        System.out.println(fu.num);//10
//        System.out.println(fu.age);//错误写法
    }
}
