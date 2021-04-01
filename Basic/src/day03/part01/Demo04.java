package day03.part01;

import java.nio.charset.StandardCharsets;

//字符串方法
public class Demo04 {
    public static void main(String[] args) {
        String str = "12345qwerzxcv";
        int length = str.length();
        System.out.println(length);

        String str1 = "123";
        String str2 = "abc";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        char charAt = str.charAt(0);
        System.out.println(charAt);//1

        int index = str.indexOf("qwer");//第一次找到的位置
        System.out.println(index);//5

        String substring = str.substring(5);
        System.out.println(substring);

        char[] chars = str.toCharArray();
        System.out.println(chars[5]);

        byte[] bytes = str.getBytes();
        System.out.println(bytes[0]);

        String newString = str.replace("1","一");
        System.out.println(newString);

        String strr = "aaa,bbb,ccc";
        String[] arr = strr.split(",");
        System.out.println(arr[0]);

        String dian = "xxx.yyy.zzz";
        String[] arr1 = dian.split("\\.");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
