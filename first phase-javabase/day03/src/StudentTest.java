import java.util.Arrays;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/27 14:33
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {

        //创建Student[]
        Student[] s1 = new Student[20];
        //使用循环，给数组的元素赋值
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new Student();
            //给每一个学生对象的number、state、score属性赋值
            s1[i].number = i+1;
            s1[i].state = (int)(Math.random() * 6 +1);
            s1[i].score = (int) (Math.random() * 101);
        }
        //需求1：打印出3年级（state值为3）的学生信息

        StudengUtil su1 = new StudengUtil();
        su1.printInfoWithSate(s1,3);

        System.out.println("***********************");
        //需求2：使用冒泡排序按学生成绩排序
        su1.sort(s1);
        //需求3:并遍历所有学生信息
        su1.list(s1);
    }
}
