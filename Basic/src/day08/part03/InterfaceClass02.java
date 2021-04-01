package day08.part03;

public class InterfaceClass02<I> implements Interface01<I>{
    @Override
    public void method(I name) {
        System.out.println(name);
    }
}
