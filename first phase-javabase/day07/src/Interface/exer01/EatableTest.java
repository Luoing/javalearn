package Interface.exer01;

import com.sun.javafx.sg.prism.web.NGWebView;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/5 15:05
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] e1 = new Eatable[3];
        Chinese c1 = new Chinese();
        American a1 = new American();
        Indian i1 = new Indian();
        e1[0] = c1;
        e1[1] = a1;
        e1[2] = i1;
        for (int i = 0; i < e1.length; i++) {
            e1[i].eat();
        }
    }
}
