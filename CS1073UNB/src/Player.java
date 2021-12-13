/**
 * 练习 static 变量
 * @author Wei Liu
 * @version V1.0
 */
public class Player {
    private String name;
    private int jersey;
    private static int uniqueJersey = 10;

    public Player(String name) {
        this.name = name;
        this.jersey = uniqueJersey;
        uniqueJersey += 10;
    }

    public String getName() {
        return name;
    }

    public int getJersey() {
        return jersey;
    }

    @Override
    public String toString() {
        return name + "\t" + jersey;
    }
}
