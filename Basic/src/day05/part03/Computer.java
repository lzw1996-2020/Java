package day05.part03;

public class Computer {
    public void openOwn() {
        System.out.println("开机");
    }

    public void closeOwn() {
        System.out.println("关机");
    }

    public void useUsb(Usb usb) {
        usb.open();
        usb.close();
        if(usb instanceof Mouse) {
            ((Mouse) usb).move();
        }
        if(usb instanceof KeyWords) {
            ((KeyWords) usb).click();
        }
    }
}
