package superExam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 13:58
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount ca1 = new CheckAccount(1122,20000,0.045,5000);
        ca1.withdraw(5000);
        System.out.println(ca1.getBalance());
//        ca1.withdraw(180000);
    }
}
