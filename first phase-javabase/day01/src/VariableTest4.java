public class VariableTest4 {
    public static void main(String[] args) {
        //强制类型转换
        double d1 = 12;
        int i2 = (int) d1;
        System.out.println(i2);

        long b1 = 30L;
        method((int) b1);

    }
    public static void method(int num){
        System.out.println("num= "+num);
    }
}
