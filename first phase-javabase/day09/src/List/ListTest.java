package List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 10:18
 * @Version 1.0
 */
public class ListTest {
    @Test
    public void test(){
        List l1 = new ArrayList();
        l1.add(123);
        l1.add("abc");
        l1.add("456");

        System.out.println(l1);
    }
}
