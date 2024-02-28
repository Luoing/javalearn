/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/28 15:03
 * @Version 1.0
 */
public class Kids extends MainKind{
    private int yearsold;

    public Kids() {
    }

    public Kids(int sex, int salary) {
        super(sex, salary);
    }

    public Kids(int sex, int salary, int yearsold) {
        super(sex, salary);
        this.yearsold = yearsold;
    }

    public int getYearsold() {
        return yearsold;
    }

    public void setYearsold(int yearsold) {
        this.yearsold = yearsold;
    }
    public int printAge(){
        return yearsold;
    }

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job!");
    }
}
