package exam01;

import java.util.Objects;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/4 09:59
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("tom",12);
        User u2 = new User("tom",12);
        System.out.println(u1.equals(u2));
    }
}
class User{
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写equals

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof User) {
//            User user = (User) obj;
//            if (this.age == user.age && this.name.equals(user.name)) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
//    }

    //编译器自动实现equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

}
