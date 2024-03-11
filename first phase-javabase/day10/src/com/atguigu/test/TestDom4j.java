package com.atguigu.test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/11 09:42
 * @Version 1.0
 */
public class TestDom4j {
    @Test
    public void testread() throws DocumentException {
        //读取jdbc.xml配置文件，获得document对象
        SAXReader saxReader = new SAXReader();
        //通过类加载器指定读取字节码文件流下的文件
        InputStream resourceAsStream = TestDom4j.class.getClassLoader().getResourceAsStream("jdbc.xml");
        //获得输入流解析为Dom对象
        Document document = saxReader.read(resourceAsStream);
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
    }
}
