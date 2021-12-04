package a12;

public class ShortTermResidentMember extends Member {
    private String departureDate;

    public ShortTermResidentMember(String name, int unit, String phoneNumber, String departureDate) {
        super(name, unit, phoneNumber);
        this.departureDate = departureDate;
    }

    public String getDepartureDate() {
        return this.departureDate;
    }

    @Override
    public boolean signOut(EntertainmentItem item) {
        return false;
    }
}
