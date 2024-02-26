/**
 * Description:
 * （1）声明一个MyDate类型，有属性：年year，月month，日day
 * （2）声明一个Employee类型，包含属性：编号、姓名、年龄、新资、生日（MyDate类型）
 * （3）在EmployeeTest测试类中的main(）中，创建两个员工对象，并为他们的姓名和生日赋值，并显示
 *
 * @Author QiQi Luo
 * @Create 2024/2/26 15:59
 * @Version 1.0
 */
public class EmplpyeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "小王";
        emp1.age = 20;
        emp1.salary = 1800;
        emp1.date = new MyDate();
        emp1.date.year = 2000;
        emp1.date.month = 12;
        emp1.date.day = 31;
        System.out.println(emp1.id+" "+emp1.salary+" "+emp1.date.day);
    }
}
