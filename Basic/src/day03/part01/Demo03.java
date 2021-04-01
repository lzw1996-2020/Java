package day03.part01;
//字符串
//字符串的内容不可改变
public class Demo03 {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);

        char[] charArr = {'A','B','C'};
        String str2 = new String(charArr);
        System.out.println(str2);

        byte[] byteArr = {90,50,40};
        String str3 = new String(byteArr);
        System.out.println(str3);

        String str11 = "abc";
        String str22 = "abc";
        System.out.println(str11 == str22);//true
    }
}
