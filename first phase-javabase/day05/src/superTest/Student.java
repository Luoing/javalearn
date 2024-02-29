package superTest;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 09:35
 * @Version 1.0
 */
public class Student extends Person{
    String school;
    public void study(){
        System.out.println("学生学习");
    }

    public void eat(){
        System.out.println("学生吃饭");
    }
    public void sleep(){
        System.out.println("学生睡觉");
    }
    public void show(){
        super.eat();
    }
    public void show1(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public Student() {
        super();//调用父类的空参构造器
        System.out.println("student的空参构造器");
    }

    public Student(String name,int age) {
        this();
        System.out.println("student的含参构造器");

    }
}

