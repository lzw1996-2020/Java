package day03.part01;

import java.util.ArrayList;

//ArrayList
public class Demo02 {
    public static void main(String[] args) {
        //范型只能是引用类型
        ArrayList<String> list = new ArrayList<>();

        list.add("123");//添加
        System.out.println(list);//[123]

        String str = list.get(0);//获取
        System.out.println(str);//123

        list.remove(0);//删除
        System.out.println(list);//[]

        int length = list.size();//长度
        System.out.println(length);//0

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(200);
        list1.add(400);
        list1.add(39);
        int i = list1.get(0);
        System.out.println(i);
    }
}
