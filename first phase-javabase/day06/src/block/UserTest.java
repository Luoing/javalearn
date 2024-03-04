package block;

import javafx.scene.SubScene;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/4 15:44
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.info());

        System.out.println("*********************");
        User u2 = new User();
        System.out.println(u2.info());
    }
}
