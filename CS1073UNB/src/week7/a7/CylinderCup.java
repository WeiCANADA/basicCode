package week7.a7;

/**
 * A7 Q1 PartA
 * This class represent a cylindrical cup
 * @author Wei Liu
 */
public class CylinderCup {
    /**
     * the radius in centimetres
     * */
    private double h;
    /**
     * the height in centimetres
     * */
    private double r;
    /**
     *A constructor method (which initializes the two instance variables)
     * @param height The height of the cone cup
     * @param radius The radius of the cone cup
     * */
    public CylinderCup(double radius, double height) {
        this.h = height;
        this.r = radius;
    }
    /**
     This method retrieves the height of the cylinder cup.
     *@return the height of the cylinder cup
     **/
    public double getH() {
        return h;
    }
    /**
     This method retrieves the radium of the cylinder cup.
     *@return the radium of the cylinder cup
     **/
    public double getR() {
        return r;
    }

    /**
     calculate the surface area of the cylinder cup
     *@return the Surface area of the cylinder cup
     **/
    public double surfaceArea(){
        return Math.PI * r * r + 2 * Math.PI * r * h;//???
    }
    /**
     calculate the volume of the cylinder cup
     *@return the volume of the cylinder cup
     **/
    public double volume(){
        return Math.PI * r * r * h;
    }
}
