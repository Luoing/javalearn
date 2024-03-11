package Iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 09:26
 * @Version 1.0
 */
public class IteratorTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add("java");
        coll.add(new Object());

        Iterator iterator = coll.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}