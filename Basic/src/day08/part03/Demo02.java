package day08.part03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");

        getList(list1);
        getList(list2);


        Collection<Integer> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        Collection<Number> c3 = new ArrayList<>();
        Collection<Object> c4 = new ArrayList<>();

//        test1(c1);
//        test1(c2);
//        test1(c3);
//        test1(c4);
//
//        test2(c1);
//        test2(c2);
//        test2(c3);
//        test2(c4);
    }

    public static void getList(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
          Object obj  =  it.next();
            System.out.println(obj);
        }
    }

    public static void test1(Collection<? extends Number> coll) {

    }

    public static void test2(Collection<? super Number> coll) {

    }
}
