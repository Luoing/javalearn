package CollectionMap.exer01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 14:34
 * @Version 1.0
 */
public class MyDate {
    private int years;
    private int months;
    private int days;

    public MyDate() {
    }

    public MyDate(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "years=" + years +
                ", months=" + months +
                ", days=" + days +
                '}';
    }
}
