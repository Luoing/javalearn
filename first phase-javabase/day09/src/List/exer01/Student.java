package List.exer01;

import java.util.Objects;

/**
 * Description:
 *案例：键盘录入学生信息，保存到集合List中。
 * （1）定义学生类，属性力姓名、年龄，提供必要的getter、setter方法，构造器，tostring（），equals（）方法。
 * （2）使用ArrayList集合，保存录入的多个学生对象。
 * （3）循环录入的方式，1：继续录入，0：结束录入。
 * （4） 录入結束后，用foreach遍历集合。
 * @Author QiQi Luo
 * @Create 2024/3/7 10:46
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
