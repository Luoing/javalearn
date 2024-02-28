/**
 * Description:
 *1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的构造器：自定义
 * 包含的方法：访问器方法（getter和setter方法），取款方法withdraw（），存款方法deposit（）。
 * 提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 * @Author QiQi Luo
 * @Create 2024/2/28 11:08
 * @Version 1.0
 */
public class Account {
    private int id;//账户
    private double balance;//余额
    private double annuallnterestRate;//年利率

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public void withdraw(double amount){
        if (amount<=balance){
            balance -= amount;
        }else {
            System.out.println("余额不足");
        }

    }
    public void deposit(double amount){
        balance+=amount;

    }
}
