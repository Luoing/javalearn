package superExam;

/**
 * Description:
 * 修改方法重写的练习2中定义的类Kids中employeed（）方法，
 * 在该方法中调用父类ManKind的employeed （）方法，
 * 然后再输出"but Kids should study and no job."
 * @Author QiQi Luo
 * @Create 2024/2/29 10:55
 * @Version 1.0
 */
public class ManKind {
    private String  name;
    private int age;

    public ManKind() {
    }

    public ManKind(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void employeed(){
        System.out.println("人应该好好工作");
    }
}
