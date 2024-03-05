package Interface.exer03;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 15:56
 * @Version 1.0
 */
public class Bicycle extends Vehicle{
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车动");

    }
}
