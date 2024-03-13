package com.atguigu.schedule.test;

import com.atguigu.schedule.util.MD5Util;
import org.junit.Test;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/13 11:12
 * @Version 1.0
 */
public class EncryptTest {
    @Test
    public void testencry(){
        String encrypt = MD5Util.encrypt("123456");
        System.out.println(encrypt);
    }
}
