package day08.part01;

public class Demo02 {
    public static void main(String[] args) {
        String s1 = 100 + "";
        System.out.println(s1+200);//100200

        String s2 = Integer.toString(100);
        System.out.println(s2+300);//100300

        String s3 = String.valueOf(100);
        System.out.println(s3+400);//100400

        int i = Integer.parseInt("100");
        System.out.println(i+500);//600
    }
}
