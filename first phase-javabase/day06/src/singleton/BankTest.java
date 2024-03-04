package singleton;

/**
 * Description:
 * 单例模式中禁止构造器对外暴露，被直接调用
 * @Author QiQi Luo
 * @Create 2024/3/4 14:21
 * @Version 1.0
 */
public class BankTest {

}

//饿汉式
class Bank{
    //1、类的构造器私有化
    private Bank(){

    }

    //2、在类的内部创建当前类的实例
    private static Bank instance = new Bank();

    //3、使用get方法获取当前类的实例，必须声明为static
    public static Bank getInstance(){
        return instance;
    }

}
