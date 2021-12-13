package a12;
/**
 * A12 Q2
 * This class represents a resident of the condo who has signed up for the building's lending library.
 * @Author Wei Liu
 * */
public  class ResidentMember {
    /**
     * The items were signed out
     */
    EntertainmentItem[] items;
    /**
     * The name of the resident
     */
    private final String name;
    /**
     * The number of the unit
     */
    private final int unitNumber;
    /**
     * The  phone Number of the resident
     */
    private String phoneNumber;
    /**
     * The  membership Number of the resident
     */
    private final int membershipNumber;
    /**
     * The  start Membership Number of the resident
     */
    private static int uniqueMembershipNumber = 500000;

    /**
     * constructor method which initializes all instance variables
     *
     * @param name The name of the resident
     * @param unit The number of unit
     * @param phoneNumber The  phone umber of resident
     */
    public ResidentMember(String name, int unit, String phoneNumber) {
        this.name = name;
        this.unitNumber = unit;
        this.phoneNumber = phoneNumber;
        this.membershipNumber = uniqueMembershipNumber;
        uniqueMembershipNumber++;
        this.items = new EntertainmentItem[0];
    }
    /**
     * Retrieves the name of the resident
     *
     * @return The name of the resident
     **/
    public String getName() {
        return name;
    }
    /**
     * Retrieves the unit number of the resident
     *
     * @return The unit number of the resident
     **/

    public int getUnitNumber() {
        return unitNumber;
    }
    /**
     * Retrieves the phone number of the resident
     *
     * @return The phone number of the resident
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Retrieves the membership number of the resident
     *
     * @return The membership number of the resident
     **/
    public int getMembershipNumber() {
        return membershipNumber;
    }
    /**
     * Set the phone number of the resident
     *
     * @param phoneNumber The phone number of the resident
     **/
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * Retrieves the Items of the resident signed out
     *
     * @return the Items array of the resident signed out
     **/
     public EntertainmentItem[] getSignedOutItems(){
        return items;
    }
    /**
     * The methods for signing out an item
     * @return boolean value whether the item was signed out
     * @param item the item are signing out
    * */
    public boolean signOut(EntertainmentItem item){
        boolean b = false;
        int len = items.length;
        if (len < 7) {
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
    /**
     * The methods for returning an item
     * @return boolean value whether the item was returned
     * @param returnItem  the item are signing out
     * */
    public boolean returnItem(EntertainmentItem returnItem){
        boolean b = false;
        int len = this.items.length;
        if (len > 0) {
            EntertainmentItem[] temp = new EntertainmentItem[len - 1];
            int index = 0;
            for (int i = 0; i < temp.length; i++) {
                if (items[i].equals(returnItem)) {
                    index = i;
                    b = true;
                    break;
                }
            }

            for (int i = 0; i < temp.length; i++) {
                if (i < index) {
                    temp[i] = this.items[i];
                } else {
                    temp[i] = this.items[i + 1];
                }
            }
            this.items = temp;
        }
        return  b;
    }
}

