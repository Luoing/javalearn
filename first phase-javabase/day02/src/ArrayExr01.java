import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: ArrayExr01
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/26 11:04
 * @Version 1.0
 */
public class ArrayExr01 {
    public static void main(String[] args) {
        int a;
        Scanner s1 = new Scanner(System.in);
        a = s1.nextInt();
        int[] stu = new int[a];

        for (int i = 0; i<stu.length; i++){
            stu[i] = s1.nextInt();
        }

        int maxScore = 0;
        for (int i = 0;i< stu.length;i++){
            if (maxScore<stu[i]){
                maxScore = stu[i];
            }
        }
        System.out.println("最高分为："+maxScore);





    }
}
