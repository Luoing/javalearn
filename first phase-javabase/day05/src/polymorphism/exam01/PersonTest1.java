package polymorphism.exam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/2/29 15:44
 * @Version 1.0
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();
//        p1.earnMoney()//不可调用多态类特有的属性
        //向下转型
        Man m1 = (Man) p1;
        m1.earnMoney();
        m1.walk();

//*建议在向下转型之前，使用instanceof进行判断，避免出现类型转换异常

        Person p2 = new Woman();
        if (p2 instanceof Man){
            Man m2 = (Man) p2;
            m2.earnMoney();
        }
    }


}
