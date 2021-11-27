package week12;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class Array_DigitFrequency {
    public static void main(String[] args) {
        final int[] ints = digitFrequency(12345678);
        for (int anInt : ints) {
            System.out.print(anInt + "\t");
        }
    }
    public static int[] digitFrequency (int number){
        int[] freq =new int[10];
        if(number == 0) freq[0] = 1;
        while ( number > 0){
         freq[number%10] ++;
         number /= 10;
        }

        return freq;
    }
}
