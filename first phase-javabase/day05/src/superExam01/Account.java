package superExam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 11:03
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annuallnterRate;

    public Account(int id, double balance, double annuallnterRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterRate = annuallnterRate;
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

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public double getAnnuallnterRate() {
        return annuallnterRate;
    }

    public void setAnnuallnterRate(double annuallnterRate) {
        this.annuallnterRate = annuallnterRate;
    }
    public double getMonthlyinterest(){
        return annuallnterRate/12;

    }
    public void withdraw(double amount){
        if (amount<=balance){
            balance-=amount;
        }else {
            System.out.println("余额不足");
        }

    }
    public void deposit(double amount){
        balance+=amount;
    }
}
