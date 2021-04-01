package day06.part01;

public class Demo02 {
    int num = 10;
    public class Nei {
        int num = 20;
        public void getNum() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Demo02.this.num);
        }
    }
}
