package Interface.exer03;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 15:50
 * @Version 1.0
 */
public class Developer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle){
        vehicle.run();

    }
}
