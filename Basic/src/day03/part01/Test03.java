package day03.part01;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        String str ="sa324rwerwadsfgfhg";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
    }
}
