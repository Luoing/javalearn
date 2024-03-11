package CollectionMap.exer01;

import org.junit.Test;

import javax.naming.BinaryRefAddr;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/7 14:38
 * @Version 1.0
 */
public class employeeTest {
    @Test
    public void test(){
        TreeSet<employee> set = new TreeSet<>();
        employee e1 = new employee("c",10,new MyDate(2000,12,12));
        employee e2 = new employee("b",11,new MyDate(2001,12,13));
        employee e3 = new employee("a",11,new MyDate(2001,12,13));

        set.add(e1);
        set.add(e2);
        set.add(e3);

        Iterator<employee> iterator = set.iterator();
        while (iterator.hasNext()){
            employee employee = iterator.next();
            System.out.println(employee);
        }


    }
}
