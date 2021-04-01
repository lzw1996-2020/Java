package day07.part02;

import java.util.Calendar;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));

        c.set(Calendar.YEAR,9999);
        System.out.println(c);
        c.add(Calendar.YEAR,1000);
        System.out.println(c);
        Date date = c.getTime();
        System.out.println(date);
    }
}
