package day08.part01;
//包装类
public class Demo01 {
    public static void main(String[] args) {
        Integer i = new Integer(4);
        System.out.println(i);
        Integer i1 = new Integer("4");
        System.out.println(i1);

        Integer i2 = Integer.valueOf(4);
        Integer i3 = Integer.valueOf("4");
        System.out.println(i2);
        System.out.println(i3);

//        拆箱
        int i5 = i.intValue();
        System.out.println(i5);

        Integer i6 = 6;
        i6 = i6 + 2;
        System.out.println(i6);
    }
}
