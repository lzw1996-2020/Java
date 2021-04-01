package day07.part01;

public interface Test {
    void test1();
    default void test() {
        System.out.println("111");
    }
    private void test2() {

    }
}
