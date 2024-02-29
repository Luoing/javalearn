package superTest;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 09:40
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.eat();
        stu1.show();
        stu1.show1();
        System.out.println("******************");

        Student stu2 = new Student();
        System.out.println("****************");
        Student stu3 = new Student("jreey",20);
    }
}
