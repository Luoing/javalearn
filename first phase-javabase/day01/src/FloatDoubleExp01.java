public class FloatDoubleExp01 {
    public static void main(String[] args) {
        //案例2：小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
        //它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
        //°C=（F-32） /1.8
        double c;
        double f = 80.0;
        System.out.println("华氏温度为："+f+","+"摄氏温度为："+(f-32)/1.8);
    }
}
