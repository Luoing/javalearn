import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * Description:
 * 根据上一章数组中的常用算法操作，自定义一个操作int［］的工具类。
 * 涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转、
 * 数组排序（默认以小到大排序）、查找等
 * @Author QiQi Luo
 * @Create 2024/2/27 13:45
 * @Version 1.0
 */
public class MyArrays {
    public int getMax(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }

    public int getMin(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }

    public int getSum(int[] arr){
        return Arrays.stream(arr).sum();
    }

    public double getAveg(int[] arr){
        return Arrays.stream(arr).average().getAsDouble();
    }


}
