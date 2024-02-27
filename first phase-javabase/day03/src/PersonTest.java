/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/27 11:01
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.study();
        p1.age = 10;
        p1.addAge(2);
        int age = p1.showAge();
        System.out.println("age= "+age);
//        System.out.println(p1.age);
    }
}
