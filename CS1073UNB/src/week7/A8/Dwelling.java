package week7.A8;
/**
 * A8 Q1 PartA
 * a class named Dwelling that can be used to represent a home
 * @author Wei Liu
 * */
public class Dwelling {
    /**
     * The name of the owner
     * */
    private String owner;
    /**
     * The type of dwelling
     * */
    private String type;
    /**
     * The size of the dwelling
     * */
    private int size;
    /**
     * If the dwelling has a fireplace or not
     * */
    private boolean hasFirePlace;
    /**
     * constructor method which initializes all instance variables
     * @param owner The name of the owner
     * @param type The type of dwelling
     * @param size The size of the dwelling
     * @param hasFirePlace If the dwelling has a fireplace or not
     */
    public Dwelling(String owner, String type, int size, boolean hasFirePlace) {
        this.owner = owner;
        this.type = type;
        this.size = size;
        this.hasFirePlace = hasFirePlace;
    }
    /**
     * @return The name of the owner
     **/
    public String getOwner() {
        return owner;
    }
    /**
     * @return The type of dwelling
     **/
    public String getType() {
        return type;
    }
    /**
     * @return The size of dwelling
     **/
    public int getSize() {
        return size;
    }
    /**
     * Calculate the annual insurance cost for the dwelling
     *
     * @param rate The base rate for the cost per square foot
     * @return The amount of the insurance
     */
    public double calInsurance(double rate){
        return hasFirePlace? rate * this.size + 150 : rate * this.size;
    }

    @Override
    public String toString() {
        return owner + " (" + type + ")\t\t" + size;
    }
}
