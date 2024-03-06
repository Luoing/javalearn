package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/6 16:39
 * @Version 1.0
 */
public class CollectionTest {

    //添加
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add("java");
        coll.add(new Object());

//        System.out.println(coll);

        Collection coll1 = new ArrayList();
        coll1.add("BB");
        coll1.add(456);

        coll1.addAll(coll1);
//        System.out.println(coll1);

        System.out.println(coll.isEmpty());
    }


}
