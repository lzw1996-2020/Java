package day08.part02;

import java.util.ArrayList;
import java.util.Collection;

//集合
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("qwer");
        System.out.println(c);//[qwer]
        System.out.println(c.size());//1
        c.remove("qwer");
        System.out.println(c);//[]

        c.add("1");
        c.add("2");
        c.add("3");
        System.out.println(c.contains("2"));//true
        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());//true

        c.add("1");
        c.add("2");
        c.add("3");
        Object[] arr = c.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
