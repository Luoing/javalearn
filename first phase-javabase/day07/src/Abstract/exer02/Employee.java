package Abstract.exer02;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 11:10
 * @Version 1.0
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}
