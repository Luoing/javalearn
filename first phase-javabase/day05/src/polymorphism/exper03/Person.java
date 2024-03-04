package polymorphism.exper03;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/1 14:33
 * @Version 1.0
 */
class Person{
    protected String name = "person";
    protected int age = 50;
    public String getInfo(){
        return "Name："+name+"\n"+"age: "+age;
    }
}
