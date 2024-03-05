package Interface.apply;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 14:23
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {
        Computer cp1 = new Computer();
        printer p1 = new printer();
//        cp1.transferDate(p1);
        Camera c1 = new Camera();
        cp1.transferDate(c1);
    }
}

class Computer{
    public void transferDate(USB usb){
        System.out.println("设备连接成功");
        usb.start();
        System.out.println("数据传输成功");
        usb.stop();
    }
}
class Camera implements USB{

    @Override
    public void start() {
        System.out.println("照相机开始拍照");
    }

    @Override
    public void stop() {
        System.out.println("照相机停止拍照");
    }
}

class printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");

    }
}

interface USB{
//    public abstract void start();
    void start();
    void stop();
}
