/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/27 15:11
 * @Version 1.0
 */
public class StudengUtil {

    /**
     * 打印制定年级的学生信息
     */
    public void printInfoWithSate(Student[] s1,int index){
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].state == index){
                System.out.println(s1[i].number+" "+s1[i].score+" "+s1[i].state);
            }
        }

    }
    /**
     * 冒泡排序从低到高进行排序
     */
    public void sort(Student[] s1){
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1.length - i - 1; j++) {
                if (s1[j].score > s1[j+1].score){
                    Student temp = s1[j];
                    s1[j] = s1[j+1];
                    s1[j+1] = temp;
                }
            }

        }
    }

    public void list(Student[] s1){
        for (int i = 0; i < s1.length; i++) {
            Student stu = s1[i];
            System.out.print(stu.score+" ");
        }
    }

}
