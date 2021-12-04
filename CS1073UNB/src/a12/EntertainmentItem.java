package a12;

public class EntertainmentItem {
    private String description;
    private boolean benefactorDonated;
    private double price;
    private int size;
    private EntertainmentItem[] items;

    public EntertainmentItem(String description,double price, boolean benefactorDonated) {
        this.description = description;
        this.benefactorDonated = benefactorDonated;
        this.price = price;
        this.size = 0;
    }

    public EntertainmentItem(int size) {
       items = new EntertainmentItem[size];
    }

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
