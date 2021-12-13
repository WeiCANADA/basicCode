package a12;
/**
 * A12 Q2
 * This class represents a short term resident of the condo who has signed up for the building's lending library.
 * @Author Wei Liu
 * */
public class ShortTermResidentMember extends ResidentMember {
    /**
     * The  departure date of the  shotr term resident
     */
    private String departureDate;
    /**
     * constructor method which initializes all instance variables
     *
     * @param name The name of the resident
     * @param unit The unit number of the resident
     * @param phoneNumber The  phone umber of the resident
     * @param departureDate The departure date of the resident
     */
    public ShortTermResidentMember(String name, int unit, String phoneNumber, String departureDate) {
        super(name, unit, phoneNumber);
        this.departureDate = departureDate;
    }
    /**
     * Retrieves the departure date of the resident
     *
     * @return The departure date of the resident
     **/
    public String getDepartureDate() {
        return this.departureDate;
    }

    @Override
    /**
     * The methods for signing out an item
     * @return boolean value whether the item was signed out
     * @param item the item are signing out
     * */
    public boolean signOut(EntertainmentItem item) {
        boolean b = false;
        int len = items.length;
        if (len < 6 && !item.getBenefactorDonated()) {
            EntertainmentItem[] temp = new EntertainmentItem[len + 1];
            for (int i = 0; i < len; i++) {
                temp[i] = items[i];
            }
            temp[len] = item;
            items = temp;
            b = true;
        }
        return  b;
    }
}
