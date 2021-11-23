package week7.A8;

/**
 * A8 Q1 PartB
 * This class will be used to represent a dwelling that is a town house.
 */
public class TownHouse extends Dwelling {
    ;
    /**
     * If the townhouse is an end unit or not
     */
    private boolean isEndUnit;

    /**
     * constructor method which initializes all instance variables
     *
     * @param owner        The name of the owner
     * @param type         The type of dwelling
     * @param size         The size of the dwelling
     * @param hasFirePlace If the dwelling has a fireplace or not
     * @param isEndUnit If the townhouse is an end unit or not
     */
    public TownHouse(String owner, String type, int size, boolean hasFirePlace, boolean isEndUnit) {
        super(owner, type, size, hasFirePlace);
        this.isEndUnit = isEndUnit;
    }

    /**
     * Calculate the annual insurance cost for the town house
     *
     * @param rate The base rate for the cost per square foot
     * @return The amount of the insurance
     */
    @Override
    public double calInsurance(double rate) {
        return this.isEndUnit ? super.calInsurance(rate) + 175 : super.calInsurance(rate) + 250;
    }
}
