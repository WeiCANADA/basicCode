package week9.a9;

/**
 *This Class represent a full day Pass
 * @author: Wei Liu
 */
public class FullDayPass extends Pass{
    /**
     * constructor method which initializes all instance variables
     *
     * @param name The name of the owner
     * @param numT The number of training modules
     * @param numG The number of grooming sessions
     */
    public FullDayPass(String name, int numT, int numG) {
        super(name, numT, numG);
    }

    @Override
    /**
     * Calculate the total cost of full day pass
     *
     * @return The amount of the insurance
     */
    public double calCost() {
        return 2916 + 65 * (getNumG() - 1) + 60 * getNumT();
    }
    /**
     *All full-day pass holders are assigned to Canine Cottage 1.
     *
     * @return The number of the cottage
     */
    @Override
    public int numCottage() {
        return 1;
    }
}
