package superExam;

/**
 * Description:
 *修改方法重写的练习2中定义的类Kids中employeed（）方法，
 * 在该方法中调用父类ManKind的employeed （）方法，
 * 然后再输出"but Kids should study and no job."
 * @Author QiQi Luo
 * @Create 2024/2/29 10:54
 * @Version 1.0
 */
public class Kids extends ManKind{

    @Override
    public void employeed() {
        super.employeed();
        System.out.println("but Kids should study and no job.");
    }
}
