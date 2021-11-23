package week7.A8;

/**
 * A8 Q1 PartC
 * This class will be used to represent a dwelling that is a home business.
 *
 * @author Wei Liu
 */
public class HomeBusiness extends Dwelling {
    /**
     *The size of the business
     */
    private int businessSize;

    /**
     * constructor method which initializes all instance variables
     * @param owner        The name of the owner
     * @param type         The type of dwelling
     * @param size         The size of the dwelling
     * @param hasFirePlace If the dwelling has a fireplace or not
     * @param businessSize The size of the business
     */
    public HomeBusiness(String owner, String type, int size, boolean hasFirePlace, int businessSize) {
        super(owner, type, size, hasFirePlace);
        this.businessSize = businessSize;
    }

    /**
     * Calculate the annual insurance cost for the home business
     *
     * @param rate The base rate for the cost per square foot
     * @return The amount of the insurance
     */
    @Override
    public double calInsurance(double rate) {
        return this.businessSize > super.getSize() * 0.5 ?
                super.calInsurance(rate + 2.35) : super.calInsurance(rate + 1.84);
    }
}
