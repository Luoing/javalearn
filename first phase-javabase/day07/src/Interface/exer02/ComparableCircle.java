package Interface.exer02;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 15:25
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
//            return this.getRadius() - c.getRadius();
            return Double.compare(this.getRadius(), c.getRadius());
        }
        else {
            throw new  RuntimeException("输入的类型不匹配");
        }
    }
}
