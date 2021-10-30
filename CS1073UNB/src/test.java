/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021/10/27 13:43
 */
public class test {
    public static void main(String[] args) {
        double x = 4.75;
        int a = (int) x;
        int b = a;
        int c = 11;

        while (b > 1) {
            b = --c / a;
        }
        System.out.println("c :" + c);
    }
}
