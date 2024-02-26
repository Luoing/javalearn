import java.util.Scanner;

/**
 * ClassName: ArrayExrt
 * Description:
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * ｛"Monday"，"Tuesday"，"Wednesday"， "Thursday"， "Friday"， "Saturday"， "Sunday"｝
 * @Author QiQi Luo
 * @Create 2024/2/26 10:54
 * @Version 1.0
 */
public class ArrayExrt {
    public static void main(String[] args) {
//        int index;
        String[] a = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner s1 = new Scanner(System.in);
//        index = s1.nextInt()+1;
        System.out.println(a[s1.nextInt()-1]);
        s1.close();
    }
}
