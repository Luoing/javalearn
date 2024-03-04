package polymorphism.exper04;

/**
 *
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/1 15:10
 * @Version 1.0
 */
public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人上厕所");
    }

    public void makeup(){
        System.out.println("女人化妆");
    }
}
