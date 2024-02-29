package polymorphism.exper;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 16:26
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest t1 = new GeometricTest();
        t1.displayGeometricObject(new Circle(),new MyRectangle());
    }
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findAreas() == g2.findAreas();
    }
    public void displayGeometricObject(GeometricObject g){
        System.out.println("几何图形的面积为："+g.findAreas());
    }
}
