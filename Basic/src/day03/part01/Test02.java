package day03.part01;

import java.util.ArrayList;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            list1.add(num);
        }
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i)%2 == 0) {
                list2.add(list1.get(i));
            }
        }
        System.out.println(list2.size());
        System.out.println(list2);
    }
}
