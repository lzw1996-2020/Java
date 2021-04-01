package day07.part02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);//Fri Mar 19 15:41:45 CST 2021
        Date d1 = new Date(0L);
        System.out.println(d1);//Thu Jan 01 08:00:00 CST 1970

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String dateString = sdf.format(date);
        System.out.println(dateString);
        Date stringToDate = sdf.parse("2021-03-19 16-42-30");
        System.out.println(stringToDate);
    }
}
