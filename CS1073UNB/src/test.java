import java.util.Random;

public class test {
    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int [][] ints = new int[row][col];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = random.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            int sum = 0;
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
                sum += ints[i][j];
            }
            System.out.println(sum);
        }

        for (int i = 0; i < ints[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < ints.length; j++) {
                sum += ints[j][i];
            }
            System.out.print(sum + "\t");
        }

        System.out.println();
    }
}
