package Abstract;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 09:57
 * @Version 1.0
 */
public abstract class Person {//抽象类，不可被实例化
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public abstract void eat();//抽象方法不能有方法体

    public abstract void sleep();

}
