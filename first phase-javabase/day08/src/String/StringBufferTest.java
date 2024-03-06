package String;

import org.junit.Test;

/**
 * Description:
 *（1） StringBuffer append（xx）：提供了很多的append（）方法，用于进行字符串追加的方式拼接（2） StringBuffer delete（int start, int end）：刪除［start,end）之间字符
 * w Hiera
 * （3） StringBuffer deleteCharAt（int index）：删除［index］位置字符
 * （4） StringBuffer replace（int start,int end, String str）：替换［start,end）范围的字符序！
 * （5） void setCharAt（int index,charc）：替换［index］位置字符（6） char charAt（int index）：查找指定index位置上的字符（7） StringBuffer insert（int index,xx）：在［index］位置插入xx
 * SUOIPO！！ON P
 * （8） int Length（）：返回存储的字符数据的长度（9） StringBuffer reverse（）：反转
 * @Author QiQi Luo
 * @Create 2024/3/6 15:36
 * @Version 1.0
 */
public class StringBufferTest {

    @Test
    public void test(){
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("abc").append("123");
//        System.out.println(sBuilder);
    }

    @Test
    public void test1(){
        StringBuilder sBuilder = new StringBuilder("hello");
        sBuilder.insert(2,1);
        System.out.println(sBuilder);
    }
}
