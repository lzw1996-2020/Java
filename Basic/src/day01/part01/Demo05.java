package day01.part01;

import java.util.Arrays;

//数组
public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        printArray(arr);
        String[] strArr = {"123","qwer"};
        printArray(strArr);
        System.out.println("=====================");
        System.out.println(Arrays.toString(arr));
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
