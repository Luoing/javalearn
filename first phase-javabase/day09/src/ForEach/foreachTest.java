package ForEach;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 09:55
 * @Version 1.0
 */
public class foreachTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add("java");
        coll.add(new Object());

        for (Object obj:coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test1(){
        int[] a = new int[]{2,2,3,4,9,6};
        for (int i : a){
            System.out.println(i);
        }
    }

}
