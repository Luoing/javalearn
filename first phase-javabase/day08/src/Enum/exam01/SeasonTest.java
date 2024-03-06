package Enum.exam01;

import sun.font.EAttribute;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/6 09:51
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }

}
class Season{
    //1、私有化构造器、只能读取不能修改
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //创建类的当前实例
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","很热");
    public static final Season autuAUTUMNmn = new Season("秋天","硕果累累");
    public static final Season WINTER = new Season("冬天","三九严寒");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
