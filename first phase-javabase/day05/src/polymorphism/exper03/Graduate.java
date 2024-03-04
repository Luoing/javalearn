package polymorphism.exper03;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/1 14:31
 * @Version 1.0
 */
class Graduate extends Student{
    public String major = "IT";
    public String getInfo(){
        return "Name："+name+"\n"+"age: "+age+"school："+ school+"/n"+"major "+major;
    }
}
