package day02.part01;

import java.util.Random;

//随机类型
public class Demo06 {
    public static void main(String[] args) {
        Random rd = new Random();
//        0-n
        System.out.println(rd.nextInt(122));

        int n = 100;
        int range = 1 + rd.nextInt(n);
        System.out.println(range);

        double d = rd.nextDouble() + rd.nextInt(100);
        System.out.println(d);
    }
}
