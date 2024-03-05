package Interface.exer03;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 16:09
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特","蓝色");
        developer.takingVehicle(vehicles[0]);
    }
}
