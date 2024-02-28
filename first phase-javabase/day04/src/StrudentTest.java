/**
 * Description:
 * 第一个构造器Student（String n,int a）设置类的name和age属性；
 * 第二个构造器Student（String n,int a, String s）设置类的name，age 和schooL属性；
 * 第三个构造器Student（String n,int a,String s,String m）设置类的name,age,schooL和major属性；
 * （3）在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 * @Author QiQi Luo
 * @Create 2024/2/28 10:51
 * @Version 1.0
 */
public class StrudentTest {
    public static void main(String[] args) {
        Student stu = new Student("Tom",20);
        Student stu1 = new Student("jack",21,"光明大学");
        Student stu2= new Student("marry",22,"阳光大学","程序媛");

        System.out.println(stu.getName()+" "+stu.getAge());
        System.out.println(stu1.getName()+" "+stu1.getAge()+" "+stu1.getSchool());
        System.out.println(stu2.getName()+" "+stu2.getAge()+" "+stu2.getSchool()+" "+stu2.getMajor());
    }


}
