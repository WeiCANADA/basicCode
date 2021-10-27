package week6.a5;

/**
 * A5 Q2 PartB
 * This class represents a line segment in the Cartesian co-ordinate system.
 *
 * @author Wei Liu
 */
public class LineSegment {
    /**
     * The first instance variables representing CartesianPoint objects
     */
   private CartesianPoint cp1;
    /**
     * The second instance variables representing CartesianPoint objects
     */
    private CartesianPoint cp2;

    /**
     * A constructors takes 2 CartesianPoint objects as parameters.
     *
     * @param cp1 the first end point
     * @param cp2 the second end point
     */
    public LineSegment(CartesianPoint cp1, CartesianPoint cp2) {
        this.cp1 = cp1;
        this.cp2 = cp2;
    }

    /**
     * A constructors takes 4 doubles representing the x and y coordinates for 2 points.
     *
     * @param x1 the x of the first end point
     * @param y1 the y of the first end point
     * @param x2 the x of the second end point
     * @param y2 the y of the second end point
     */
    public LineSegment(double x1, double y1, double x2, double y2) {
        this.cp1 = new CartesianPoint(x1, y1);
        this.cp2 = new CartesianPoint(x2, y2);
    }

    /**
     * An accessor ("getter") method
     * @return the first instance variable
     * */
    public CartesianPoint getCp1() {
        return cp1;
    }
    /**
     * An accessor ("getter") method
     * @return the second instance variable
     * */
    public CartesianPoint getCp2() {
        return cp2;
    }
   /**
    * A toString method that returns a String representing the line segment.
    *@return a string includes information about both end points
    * */
    @Override
    public String toString() {
        return "LineSegment: " + "End point A(" + this.cp1.getX() + ", " + this.cp1.getY() + ")" + '\t'
                + "End point B(" + this.cp1.getX() + ", " + this.cp1.getY() + ")";
    }

    /**
     * A length method that takes no parameters and returns a double representing the length of the line segment.
     * A good solution should call a method in the CartesianPoint class and be only 1 line long
     * @return the length of the line segment
     * */
    public double distance() {
        return this.cp1.distance(cp2);

    }

    /**
     * An isHorizontal method that returns true if the line segment is horizontal and false otherwise.
     * @return true if the line segment is horizontal and false otherwise
     *  */
    public boolean isHorizontal() {
        return cp1.getY() == cp2.getY();
    }

    /**
     * A slope method that returns the slope of the line segment.
     *
     * @return The value of slope
     */
    public double slope() {
        return cp1.getX() == cp2.getX() ? Double.POSITIVE_INFINITY
                : (cp2.getY() - cp1.getY()) / (cp2.getX() - cp1.getX());
    }

    /**
     *  A containsPoint method that takes 1 parameter, a CartesianPoint, and returns a boolean that is true
     *  @param cp  a CartesianPoint
     *  @return true if the CartesianPoint was contained on the line segment and false otherwise.
     *  */
    public boolean containPoint(CartesianPoint cp) {
        return (cp.getX() - cp1.getX()) * (cp1.getY() - cp2.getY())
                == (cp1.getX() - cp2.getX()) * (cp.getY() - cp1.getY());
    }

}
