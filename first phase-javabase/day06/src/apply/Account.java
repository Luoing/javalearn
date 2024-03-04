package apply;

import java.util.Objects;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/4 10:36
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0;
    }

}
