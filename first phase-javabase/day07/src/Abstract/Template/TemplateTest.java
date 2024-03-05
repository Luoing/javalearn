package Abstract.Template;

import jdk.nashorn.internal.ir.IfNode;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 10:45
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        p1.spend();
    }

}
abstract class Template{
    public void spend(){
        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println("程序运行时间为："+(end - start));

    }

    public abstract void code();
}

class PrintNumber extends Template{

    @Override
    public void code() {
        for (int i = 2; i <= 100000; i++){
            boolean isFlag = true;
            for (int j = 2;j <= Math.sqrt(i); j++){
                if (i%j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag)
                System.out.print(i+" ");
        }

    }
}
