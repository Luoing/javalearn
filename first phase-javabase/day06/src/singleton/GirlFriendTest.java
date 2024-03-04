package singleton;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/4 14:34
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {

    }
}
//懒汉式
class GirlFriend{
    //1、构造器私有化
    private GirlFriend(){

    }
    //2、声明类的实例
    private static GirlFriend instance = null;

    public static GirlFriend getInstance(){
        if (instance == null){
            instance = new GirlFriend();
        }
        return instance;
    }
}
