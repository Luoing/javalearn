package Enum.apply;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/6 10:48
 * @Version 1.0
 */
public class employeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom",12,Status.BUSY);
        System.out.println(emp1);
    }
}
