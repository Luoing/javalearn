package polymorphism.exper03;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/1 14:32
 * @Version 1.0
 */
class Student extends Person{
    protected String school = "PKU";
    public String getInfo(){
        return "Name："+name+"\n"+"age: "+age+"school："+ school;
    }

}
