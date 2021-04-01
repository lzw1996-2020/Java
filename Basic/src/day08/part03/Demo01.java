package day08.part03;

import java.util.ArrayList;
import java.util.Arrays;

//泛型
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("456");

        Fanxing<String> f = new Fanxing<>();
        f.setName("字符串");
        System.out.println(f.getName());

        Method m = new Method();
        m.getName("123");
        m.getName(123);

        Method.getStatic(18);
    }
}
