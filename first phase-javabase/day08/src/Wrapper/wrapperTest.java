package Wrapper;

import org.junit.Test;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/6 14:06
 * @Version 1.0
 */
public class wrapperTest {
    @Test
    public void test(){
        int i1 = 10;
//        Integer i = new Integer(i1);
        Integer i = Integer.valueOf(i1);
        System.out.println(i.toString());
    }
    
    @Test
    public void test1(){

    }
}
