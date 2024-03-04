package polymorphism.exper04;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/1 15:05
 * @Version 1.0
 */
public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("男人上厕所");
    }
    public void smoke(){
        System.out.println("男人抽烟");
    }
}
