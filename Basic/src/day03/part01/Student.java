package day03.part01;

public class Student {
    private String name;
    private int age;
    static String room;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void generalMethod() {
        System.out.println(name);//成员方法都可以使用
        System.out.println(room);
    }

    public static void staticMethod() {
        System.out.println("static修饰成员方法");
        System.out.println(room);//静态方法可以使用静态变量
//        System.out.println(name);//静态方法不可以访问成员变量，不能使用this
    }

}
