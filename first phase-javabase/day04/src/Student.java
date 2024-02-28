/**
 * Description:
 * （1）定义Student类，有4个属性：
 * String name；
 * int age;
 * String school;
 * String major;
 * （2）定义Student类的3个构造器：
 * -第一个构造器Student（String n,int a）设置类的name和age属性；
 * -第二个构造器Student（String n,int a, String s）设置类的name，age 和schooL属性；
 * -第三个构造器Student（String n,int a,String s,String m）设置类的name,age,schooL和major属性；
 * （3）在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 *
 * @Author QiQi Luo
 * @Create 2024/2/28 10:47
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
