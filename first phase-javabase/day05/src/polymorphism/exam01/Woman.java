package polymorphism.exam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 14:40
 * @Version 1.0
 */
public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("女人吃蔬菜");
    }

    @Override
    public void sleep() {
        System.out.println("女人睡觉");
    }

    @Override
    public void walk() {
        System.out.println("女人走路");
    }
    public void shopping(){
        System.out.println("女人喜欢逛街");
    }
}
