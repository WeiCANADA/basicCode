package week12;

/**
 * @author Wei Liu
 * @version V1.0
 * @date 2021/11/23
 */
public class Array_TwoDArray {
    public static void main(String[] args) {
        int[][] table;
        table = new int[5][10];

        //load the table with values
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = 10 * i + j;
            }
        }

        //Print the table
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
