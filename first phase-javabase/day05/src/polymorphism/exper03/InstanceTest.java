package polymorphism.exper03;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Description:
 * ClassName: InstanceTest
 * Description:
 * 建立InstanceTest 类，在类中定义方法method（Person e）；
 * 在method中：
 * （1）根据e的类型调用相应类的getInfo（）方法。
 * （2）根据e的类型执行：
 * 如果e为Person类的对象，输出：
 * "a person";
 * 如果e为Student类的对象，输出：
 * "a student"
 * "a person "
 * 如果e为Graduate类的对象，输出：
 * "a graduated student"
 * "a student"
 * "a person"
 * @Author QiQi Luo
 * @Create 2024/3/1 14:02
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest it1 = new InstanceTest();
//        it1.method(new Person());
        it1.method(new Student());
//        it1.method(new Graduate());


    }
    public void method(Person e){

        System.out.println(e.getInfo());

//        if (e instanceof Graduate){
//            Graduate g1 = (Graduate) e;
//            g1.getInfo();
//        } else if (e instanceof Student) {
//            Student stu1 = (Student) e;
//        } else if (e instanceof Person) {
//            e.getInfo();
//        }
    }

}



