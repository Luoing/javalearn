package Enum.exam01;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/6 10:16
 * @Version 1.0
 */
public class SeasonTest01 {
    public static void main(String[] args) {
        System.out.println(Season01.SPRING.toString());
    }

}
enum Season01{

    //创建类的当前实例
    SPRING ("春天","春暖花开"),
    SUMMER ("夏天","很热"),
    AUTUMN("秋天","硕果累累"),
    WINTER("冬天","三九严寒");

    //1、私有化构造器、只能读取不能修改
    private final String seasonName;
    private final String seasonDesc;

    private Season01(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }



//    @Override
//    public String toString() {
//        return "Season01{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}
