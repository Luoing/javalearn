package polymorphism.exam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 14:47
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //多态的使用前提是：1、要有类的继承关系2、要有方法的重写
        //父类的引用指向子类的对象（子类的对象赋给父类的引用）
        Person p2 = new Man();//右边是左边的子类才可以多态
        p2.walk();
        p2.eat();
    }
}
