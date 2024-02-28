/**
 * Description:
 *创建程序，在其中定义两个类：Person和PersonTest类。定义如下：
 * 用setAge（）设置人的合法年龄（0~130），用getAge（）返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，用setAge（）和getAge（）方法，体会Java的封装性。
 * @Author QiQi Luo
 * @Create 2024/2/28 10:16
 * @Version 1.0
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age <= 130){
            this.age = age;
        }else {
            System.out.println("年龄有误");
        }
    }
}
