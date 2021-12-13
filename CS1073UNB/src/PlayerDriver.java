import java.util.Scanner;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class PlayerDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int MAX = 10;
        int index = 0;
        Player[] team = new Player[MAX];

        while (scan.hasNext()){
            String name = scan.next();
            Player temp = new Player(name);
            team[index] = temp;
            index++;
        }

        for (Player player : team) {
            System.out.println(player);
        }
    }
}
