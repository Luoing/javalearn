package CollectionMap.exer01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 14:33
 * @Version 1.0
 */
public class employee implements Comparable<employee>{
    private String name;
    private int age;
    private MyDate birthday;

    public employee() {
    }

    public employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.toString() +
                '}';
    }

    @Override
    public int compareTo(employee o) {
        return this.name.compareTo(o.name);
    }
}
