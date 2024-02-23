public class StringTest {
    public static void main(String[] args) {
        //String属于一个类，属于引用类型
        //String类的变量可以用一对“”来进行赋值
        String str1 = "HelloWorld!";
        System.out.println(str1);

        String str2 = "";
        //char c1 = '';错误

        //String与基本类型只能用+来做连接运算
        int num1 = 10;
        boolean b1 = true;
        String str3 = "hello";
        System.out.println(str3+b1);
        System.out.println(str3+b1+num1);
        System.out.println(b1+str3+num1);//变换顺序1
//        System.out.println(b1+num1+str2);//变换顺序2,错误：因为boolean类型不参与运算，只有String类型的+才是连接运算

        int num2 = 10;
        String str4 = 10+"";
        System.out.println(str4+1);
        //如何将字符串中的“10”剥离出来为整型的10？使用Interge
        System.out.println(Integer.parseInt(str4)+1);

    }
}
