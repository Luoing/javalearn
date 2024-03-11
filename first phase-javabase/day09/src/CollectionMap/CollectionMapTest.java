package CollectionMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 14:08
 * @Version 1.0
 */
public class CollectionMapTest {
    @Test
    public void test(){
        List list = new ArrayList();
        list.add(67);
        list.add(68);
        list.add(69);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
            int score = integer;
        }
    }

    @Test
    public void test1(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(67);
        list.add(68);
        list.add(69);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            int score = integer;
        }
    }
}
