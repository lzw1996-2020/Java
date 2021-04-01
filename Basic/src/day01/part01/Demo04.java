package day01.part01;

import java.util.Arrays;

/*
 * 数组方法
 * */
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(arr);
        System.out.println(arr[0]);
//        遍历数组
        int[] array = {10,15,29,43,56};
        int max = array[0];
        for (int i = 0; i < array.length/2; i++) {
//            System.out.println(array[i]);
//            if(array[i]>max) {
//                max = array[i];
//            }
            int p = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = p;
        }
        System.out.println("============================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
//        System.out.println(max);

    }
}
