package week9.a9;

import java.util.Random;

/**
 * This Class represent a half day Pass
 * @author Wei Liu
 */
public class HalfDayA9Pass extends A9_Pass {
    /**
     * constructor method which initializes all instance variables
     *
     * @param name The name of the owner
     * @param numT The number of training modules
     * @param numG The number of grooming sessions
     */
    public HalfDayA9Pass(String name, int numT, int numG) {
        super(name, numT, numG);
    }

    @Override
    /**
     * Calculate the total cost of half day pass
     *
     * @return The amount of the insurance
     */
    public double calCost() {
        return 1944 + 65 * getNumG() + 85 + 70 * (getNumT() - 1);
    }

    @Override
    /**
     * Randomly assigned to Canine Cottage 2, 3, 4, 5 or 6 at the time when pass is purchased.
     *
     * @return The number of the cottage
     */
    public int numCottage() {
        Random random = new Random();

       return random.nextInt(6) + 1;
    }
}
