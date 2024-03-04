package polymorphism.exper01;

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
        Circle c1 = new Circle("red",1.0,2.3);
        Circle c2 = new Circle("red",1.0,3.3);

        t1.displayGeometricObject(c1);
        t1.displayGeometricObject(c2);

        System.out.println(t1.equalsArea(c1, c2));
        //使用匿名对象
        t1.displayGeometricObject(new MyRectangle("red",1.0,2.0,1.0));

    }
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findAreas() == g2.findAreas();
    }
    public void displayGeometricObject(GeometricObject g){
        System.out.println("几何图形的面积为："+g.findAreas());
    }
}
