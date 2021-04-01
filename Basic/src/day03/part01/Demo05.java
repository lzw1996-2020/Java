package day03.part01;

//static
public class Demo05 {
    public static void main(String[] args) {
        Student.staticMethod();//static修饰的方法可以直接通过类名.方法名()调用；不需要创建对象

        Student s1 = new Student("张三", 12);
        s1.room = "高一三班";
        System.out.println("姓名：" + s1.getName() + "  年龄：" + s1.getAge() + "  班级：" + s1.room);
        Student s2 = new Student("李四", 15);
        System.out.println("姓名：" + s2.getName() + "  年龄：" + s2.getAge() + "  班级：" + s2.room);

    }
}
