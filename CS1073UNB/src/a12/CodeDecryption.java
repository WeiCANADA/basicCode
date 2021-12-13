package a12;
import java.util.Scanner;
/**
 * * A12 Q1
* This class performs a decryption and outputs the unscrambled messages.
* @Author Wei liu
* */
public class CodeDecryption {
    public static void main(String[] args) {

        //String path = Objects.requireNonNull(Objects.requireNonNull(CodeDecryption.class.getResource("cypherText.in")).getPath());
        //System.out.println(path);
       // Scanner scan = new Scanner(new BufferedReader(new FileReader(path)));
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s = scan.nextLine().trim();
            if (s.equals("-1")) break;
            if (s.matches("[1-9]")) {
                int co = Integer.parseInt(s);
                s = scan.nextLine().trim();
                System.out.println(s);
                char[] chars1 = s.toCharArray();
                int chars1Len = chars1.length;
                System.out.println("str length: " + chars1Len);
                int ro =chars1Len / co;
                System.out.println( " ro:" + ro + "co: " + co);
                char[][] chars2D = new char[ro][co];

                for (int r = chars2D.length - 1; r >= 0; r--) {
                    if (r % 2 == 0) {
                        for (int c = 0; c < chars2D[r].length; c++) {
                            chars2D[r][c] = chars1[chars1Len - 1];
                            chars1Len--;
                        }
                    } else {
                        for (int c = chars2D[r].length - 1; c >= 0; c--) {
                            chars2D[r][c] = chars1[chars1Len - 1];
                            chars1Len--;
                        }
                    }
                }

                int count = 0;
                while(count < co){
                    if(count % 2 == 0) {
                        for (int r = chars2D.length - 1; r >= 0; r--) {
                            System.out.print(chars2D[r][count]);
                        }
                    }else {
                        for (int r = 0; r < chars2D.length; r++) {
                            System.out.print(chars2D[r][count]);
                        }
                    }
                    count++;
                }
                System.out.println();
            }

        }

    }
}