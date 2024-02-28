/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/28 15:25
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.14*radius*radius;
    }
}
