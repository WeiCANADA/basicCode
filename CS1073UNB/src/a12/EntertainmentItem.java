package a12;
/**
 * A12 Q2
 * The is class represents the EntertainmentItem  that is available at this facility
 * @Author Wei Liu
 * */
public class EntertainmentItem {
    private final String description;
    private final boolean benefactorDonated;
    private final double price;

    public EntertainmentItem(String description, double price, boolean benefactorDonated) {
        this.description = description;
        this.benefactorDonated = benefactorDonated;
        this.price = price;
    }

   /* public EntertainmentItem(int size) {
        items = new EntertainmentItem[size];
    }*/

    public String getDescription() {
        return description;
    }

    public boolean getBenefactorDonated() {
        return benefactorDonated;
    }

    public double getPrice() {
        return price;
    }
}
