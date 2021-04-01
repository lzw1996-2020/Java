package day08.part03;
//含有泛型的方法
public class Method {
    public <M> void getName(M name) {
        System.out.println(name);
    }

    public static <H> void getStatic(H age) {

    }
}
