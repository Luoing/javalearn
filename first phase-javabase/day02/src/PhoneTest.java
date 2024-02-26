/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/26 14:38
 * @Version 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();//创建类的对象
        p.name = "HuaWei";
        System.out.println(p.name);
        p.sendMessage("你好");

    }
}
