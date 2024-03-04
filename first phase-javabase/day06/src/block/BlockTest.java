package block;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/4 15:14
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
    }

}

class Person{
    String name;
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }
    public Person(){}

    {
        System.out.println("非静态代码块1");
    }

    static {
        System.out.println("静态代码块1");
    }
}
