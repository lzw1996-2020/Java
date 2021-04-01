package day06.part01;
//成员内部类的调用
public class Main {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.method();
        Demo01.Inside inside = new Demo01().new Inside();
        inside.method();

        Demo02.Nei nei = new Demo02().new Nei();
        nei.getNum();

    }
}
