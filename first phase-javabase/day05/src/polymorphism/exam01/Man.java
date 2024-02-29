package polymorphism.exam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 14:37
 * @Version 1.0
 */
public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("男人吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("男人睡觉");
    }

    @Override
    public void walk() {
        System.out.println("男人走路");
    }
    public void earnMoney(){
        System.out.println("男人赚钱养家");
    }
}
