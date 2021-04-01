package day05.part03;

public class KeyWords implements Usb{
    @Override
    public void open() {
        System.out.println("连接键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void click() {
        System.out.println("点击键盘");
    }
}
