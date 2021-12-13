package week12;

/**
*
 */
public class Array_TwoDArray {
    public static void main(String[] args) {
        int[][] table;
        table = new int[5][3];
        int count = 1;

        //load the table with values in row order
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = count++;
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
