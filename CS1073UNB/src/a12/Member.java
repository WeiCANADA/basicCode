package a12;

public abstract class Member {
    EntertainmentItem[] items;
    private final String name;
    private final int unitNumber;
    private String phoneNumber;
    private final int membershipNumber;
    private static int uniqueMembershipNumber = 500000;


    protected Member(String name, int unit, String phoneNumber) {
        this.name = name;
        this.unitNumber = unit;
        this.phoneNumber = phoneNumber;
        this.membershipNumber = uniqueMembershipNumber;
        uniqueMembershipNumber++;
        this.items = new EntertainmentItem[0];
    }

    public String getName() {
        return name;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
     public EntertainmentItem[] getSignedOutItems(){
        return items;
    }
    public abstract boolean signOut(EntertainmentItem item);

    public boolean returnItem(EntertainmentItem item){
        return false;
    }
}

