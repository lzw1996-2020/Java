package day03.part01;
//对象数组
public class Demo01 {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("张三",18);
        Person two = new Person("李四",29);
        Person three = new Person("王五",38);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array.toString());
    }
}
