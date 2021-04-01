package day02.part01;
//面向对象
public class Demo01 {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        student.name = "123";
        student.eat();
    }
}
