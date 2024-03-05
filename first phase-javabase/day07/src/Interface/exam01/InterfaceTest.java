package Interface.exam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 13:49
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
    }

}
interface Flyable{
    //全局常量
    public static final int MIN_SPEDD = 0;
    public static final int MAX_SPEED = 7900;//前面部分可省略
    int MEDIA_SPEED = 3900;

    //可以省略public static
    void fly();

}

class Plane implements Flyable{

    @Override
    public void fly() {
        
    }
}
