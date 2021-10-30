package week7.A8;

public class TownHouse extends Dwelling{;
    private boolean isEndUnit;
    public TownHouse(String owner, String type, int size, boolean hasFirePlace, boolean isEndUnit) {
        super(owner, type, size, hasFirePlace);
        this.isEndUnit = isEndUnit;
    }

    @Override
    public double calInsurance(double rate) {
        return this.isEndUnit? super.calInsurance(rate)+ 175 : super.calInsurance(rate) + 250;//??
    }
}
