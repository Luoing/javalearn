/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/28 15:28
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        length = 1;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea()*length;
    }
}
