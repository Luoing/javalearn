import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Description:
 *（1）定义一个ManKind类，包括
 * - 成员变量int sex和int salary；
 * - 方法void manOrWoman （）：根据sex的值显示“man”（sex==1）或者"woman"（sex==0）；
 * - 方法void employeed（）：根据salary的值显示"no job"（salary==0）或者"job"（salary！=0）。
 * （2）定义类Kids继承ManKind，并包括
 * - 成员变量int yearsOld；
 * -方法printAge(）打印yearsOLd的值。
 * （3）定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 * @Author QiQi Luo
 * @Create 2024/2/28 14:57
 * @Version 1.0
 */
public class MainKind {
    private int sex;
    private int salary;

    public MainKind() {
    }

    public MainKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex == 1){
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        }
    }

    public void employeed(){
        if (salary == 0){
            System.out.println("no job");
        }else {
            System.out.println("job");
        }
    }
}
