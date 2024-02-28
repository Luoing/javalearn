/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/28 09:31
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal an1 = new Animal();
        an1.setLegs(3);
        System.out.println(an1.getLegs());

    }
}
class Animal{
    private String name;
    private int legs;

    public void eat(){
        System.out.println("动物觅食");
    }
    public void setLegs(int legs){
        if (legs>0){
            this.legs = legs;
        }else {
            System.out.println("输入的不合法");
        }
    }

    public int getLegs(){
        return legs;
    }
}