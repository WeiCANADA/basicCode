package week7.a7;

/**
 * A7 Q1 PartA
 * This class represent a cone cup
 * @author Wei Liu
 */
public class ConeCup {
    /**
     * the radius in centimetres
     */
    private double r;
    /**
     * * the height in centimetres
     */
    private double h;
    /**
     * * the slant in centimetres
     */
    private double s;

    /**
     * A constructor method (which initializes all three instance variables)
     *
     * @param h The height of the cone cup
     * @param r The radius of the cone cup
     * @param s The slant height of the cone cup
     */
    public ConeCup(double r, double h) {
        this.r = r;
        this.h = h;
        this.s = Math.sqrt(r * r + h * h);
    }

    /**
     * This method retrieves the radius of the cone cup.
     *
     * @return the radius of the cone cup
     **/
    public double getR() {
        return r;
    }

    /**
     * This method retrieves the height of the cone cup.
     *
     * @return the height of the cone cup
     **/
    public double getH() {
        return h;
    }

    /**
     * This method retrieves the slant height of the cone cup.
     *
     * @return the slant height of the cone cup
     **/
    public double getS() {
        return s;
    }

    /**
     * calculate the surface area of the cone cup
     *
     * @return the Surface area of the cone cup
     **/
    public double surfaceArea() {
        return Math.PI * s * r;//???
    }

    /**
     * calculate the volume of the cone cup
     *
     * @return the volume of the cone cup
     **/
    public double Volume() {
        return Math.PI * r * r * h / 3;
    }
}
