package Abstract.exer02;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 11:16
 * @Version 1.0
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double earnings() {
        return getMonthlySalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + super.toString() +
                '}';
    }
}
