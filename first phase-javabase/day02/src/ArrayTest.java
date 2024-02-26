import java.util.Arrays;

/**
 * ClassName: ArrayTest
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/26 11:42
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3};
        int[] a2 = new  int[]{3,2,1};
        boolean isBoolean = Arrays.equals(a1,a2);
        System.out.println(isBoolean);
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
    }
}
