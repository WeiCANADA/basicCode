/**
 * @author Wei Liu
 * @version V1.0
 * @date
 */
public class DVDCollection {
    private DVD[] collection;
    private int count ;
    private double totalCost;

    public DVDCollection() {
        this.collection = new DVD[100];
        this.count = 0;
        this.totalCost = 0.0;
    }

    public void addDVD (String title, String director, int year, double cost, boolean blurray){
        if(count == collection.length)
                increaseSize();
        collection[count] = new DVD(title, director, year, cost, blurray);
        count++;
        totalCost += cost;
    }

    private void increaseSize() {
        DVD[] temp = new DVD[collection.length * 2];

        for (int i = 0; i < collection.length; i++) {
            temp[i] = collection[i];
        }

        collection = temp;
    }
}
