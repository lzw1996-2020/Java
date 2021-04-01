package day05.part03;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.closeOwn();
        computer.openOwn();

        Usb mouse = new Mouse();
        computer.useUsb(mouse);

        Usb keywords = new KeyWords();
        computer.useUsb(keywords);
    }
}
