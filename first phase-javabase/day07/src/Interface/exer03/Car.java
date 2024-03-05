package Interface.exer03;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 16:01
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower{
    private String CarNumber;

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        CarNumber = carNumber;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }

    @Override
    public void power() {
        System.out.println("用的能源是汽油发动机");
    }

    @Override
    public void run() {
        System.out.println("汽车开动");
    }
}
