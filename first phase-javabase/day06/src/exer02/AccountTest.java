package exer02;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/4 13:58
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        System.out.println(acct1);

        Account acct2 = new Account("123456",2000);
        System.out.println(acct2);

        System.out.println(Account.getAnnualRate());
        System.out.println(Account.getMinBalance());
    }
}
