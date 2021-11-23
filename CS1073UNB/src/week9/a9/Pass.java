package week9.a9;

/**
 * This abstract class represent a Pass
 *
 * @author Wei Liu
 */
public abstract class Pass {
    /**
     * The name of the owner
     */
    private String name;
    /**
     * The number of training modules
     */
    private int numT;
    /**
     * The number of grooming sessions
     */

    private int numG;

    /**
     * constructor method which initializes all instance variables
     *
     * @param name The name of the owner
     * @param numT The number of training modules
     * @param numG The number of grooming sessions
     */
    public Pass(String name, int numT, int numG) {
        this.name = name;
        this.numT = numT;
        this.numG = numG;
    }

    /**
     * Retrieves the name of the owner
     *
     * @return The name of the owner
     **/
    public String getName() {
        return name;
    }

    /**
     * Retrieves the number of training modules
     *
     * @return The number of training modules
     **/
    public int getNumT() {
        return numT;
    }

    /**
     * Retrieves the number of grooming sessions
     *
     * @return The number of grooming sessions
     **/
    public int getNumG() {
        return numG;
    }

    /**
     * Calculate the total cost
     *
     * @return The amount of the insurance
     */
    public abstract double calCost();

    /**
     * Randomly assigned to Canine Cottage 2, 3, 4, 5 or 6 at the time when pass is purchased.
     *
     * @return The number of the cottage
     */
    public abstract int numCottage();
}
