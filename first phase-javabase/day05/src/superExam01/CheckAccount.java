package superExam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 11:40
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overdraft;
    public CheckAccount(int id, double balance, double annuallnterRate) {
        super(id, balance, annuallnterRate);
    }

    public CheckAccount(int id, double balance, double annuallnterRate, double overdraft) {
        super(id, balance, annuallnterRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else if (getBalance() + overdraft >= amount) {
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        }else {
            System.out.println("超过可透支限额");
        }
    }
}
