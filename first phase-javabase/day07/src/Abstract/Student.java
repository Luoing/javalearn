package Abstract;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 09:59
 * @Version 1.0
 */
public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void eat() {//实现抽象方法体
        System.out.println("学生吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生睡觉");
    }
}
