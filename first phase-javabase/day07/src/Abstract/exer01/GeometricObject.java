package Abstract.exer01;

/**
 * Description:
 *定义三个类，父类GeometricObject代表几何形状，子类Circle代表圆形，MyRectangLe代表矩形。
 * 定义一个测试类GeometricTest，
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型）。
 * @Author QiQi Luo
 * @Create 2024/2/29 16:06
 * @Version 1.0
 */
public abstract class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract double findAreas();
}
