package exer02;

/**
 * Description:
 * 编写一个类实现银行账户的概念，包含的属性有”帐号”、”密码”、“存款余额”、”利率”、“最小余额”，
 * 定义封装这些属性的方法。账号要自动生成。
 * @Author QiQi Luo
 * @Create 2024/3/4 13:48
 * @Version 1.0
 */
public class Account {
    private int id;
    private String password;
    private double balance;
    private static double annualRate = 0.0045;
    private static double minBalance = 1;
    private static int init = 1001;


    public Account() {
        this.id = init;
        init++;
        password = "00000";
    }

    public Account(String password, double balance) {
//        this.id = id;
        this.password = password;
        this.balance = balance;
        this.id = init;
        init++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualRate() {
        return annualRate;
    }

    public static void setAnnualRate(double annualRate) {
        Account.annualRate = annualRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
