package overeide;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/28 14:17
 * @Version 1.0
 */
public class Student extends Person {
    String name;
    int age;
    String school;

    public void eat(){
        System.out.println("学生应该多吃有营养的东西");
    }
//    public void sleep(){
//        System.out.println("能睡觉");
//    }

    @Override
    public void sleep() {
        System.out.println("学生应该有充足的睡眠");
    }

    public void study(){
        System.out.println("能学习");
    }

}
