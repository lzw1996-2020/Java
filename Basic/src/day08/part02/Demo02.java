package day08.part02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代器
public class Demo02 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.add("6");
        collection.add("1");


        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
