package day03.part02;
//继承
public class Demo01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);//10
        System.out.println(fu.num);//100
        Zi zi = new Zi();
        System.out.println(zi.numZi);//20
        System.out.println(zi.numFu);//10
        System.out.println("=================");
        System.out.println(zi.num);//200
        zi.methodFu();//100
    }
}
