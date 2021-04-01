package day05.part03;

public class Mouse implements Usb{
    @Override
    public void open() {
        System.out.println("连接鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void move() {
        System.out.println("滑动鼠标");
    }
}
