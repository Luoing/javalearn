package Abstract.exer01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 16:15
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findAreas() {
        return 3.14 * getRadius() * getRadius();
    }
}
