package Abstract.exer02;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 11:11
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

    public String toDateString(){
        return getYears()+"年"+getMonths()+"月"+getDays()+"日";
    }
}
