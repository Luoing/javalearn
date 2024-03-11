package demo_json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/8 14:45
 * @Version 1.0
 */
public class JsonTest {
    @Test
    public void testwrite() throws JsonProcessingException {
        Dog dog = new Dog("小黄");
        Person p1 = new Person("张三",10,dog);

        ObjectMapper objectMapper = new ObjectMapper();
        String personStr = objectMapper.writeValueAsString(p1);
        System.out.println(personStr);
    }
    @Test
    public void testread() throws JsonProcessingException {
        String personStr = "{\"name\":\"张三\",\"age\":10,\"dog\":{\"name\":\"小黄\"}}";
        ObjectMapper objectMapper = new ObjectMapper();

        Person readValue = objectMapper.readValue(personStr, Person.class);
        System.out.println(readValue);
    }

    @Test
    public void test_MapToJson() throws JsonProcessingException {
        Map map = new HashMap();

        map.put("a","valuea");
        map.put("b","valueb");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(map);
        System.out.println(s);
    }
    
    @Test
    public void test_listtoJson() throws JsonProcessingException {
        List data = new ArrayList();
        data.add("a");
        data.add("b");
        data.add("c");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);
    }
}
