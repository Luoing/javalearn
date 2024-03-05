package Interface.exer03;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 15:58
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电车在动");
    }

    @Override
    public void power() {
        System.out.println("用的能源是电用的是电机");
    }
}
