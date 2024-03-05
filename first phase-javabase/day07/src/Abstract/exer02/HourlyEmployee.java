package Abstract.exer02;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 11:27
 * @Version 1.0
 */
public class HourlyEmployee extends Employee{

    private double wage;
    private int hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hours) {
        super(name, number, birthday);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    double earnings() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                '}';
    }
}
