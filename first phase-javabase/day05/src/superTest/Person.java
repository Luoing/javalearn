package superTest;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 09:31
 * @Version 1.0
 */
public class Person {
    String name;
    private int age;
    int id;

    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }

    public Person() {
        System.out.println("Person的空参构造器");
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
