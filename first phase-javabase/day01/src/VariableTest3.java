public class VariableTest3 {
    public static void main(String[] args) {
        //自动类型提升
        //规则：当容量小的和容量大的一起做运算时，自动提升到容量大的类型。
        //byte、short-->int-->long-->float-->double
        byte b1 = 1;
        int i1 = 10;
        long i2 = i1;
        int i3 = b1 +i1;
        /****特殊情况1****/
        byte b2 = 12;
        short s1 = 10;
        int i4 = b2 + s1;//这种类型提升规则确保了在进行算术运算时不会丢失信息。
        /****特殊情况2****/
        char c1 = 1;
        int i5 = c1+b1;
        /**********/
        long l4 = 123l;
        long l5 = 123;//自动提升将int转换为long型
    }
}
