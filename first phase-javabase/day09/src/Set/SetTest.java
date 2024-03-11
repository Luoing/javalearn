package Set;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

import java.util.HashSet;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 11:11
 * @Version 1.0
 */
public class SetTest {
    @Test
    public void test(){
        Set set = new HashSet();
        set.add("aa");
        set.add(123);
        set.add("bb");

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
