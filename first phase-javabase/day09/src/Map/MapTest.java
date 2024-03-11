package Map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 11:35
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void test(){
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map);
    }
}
