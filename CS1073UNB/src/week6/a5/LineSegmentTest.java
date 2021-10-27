package week6.a5;
/**
 * test the methods in the LineSegment Class
 * @author Wei Liu
 */
public class LineSegmentTest {
    public static void main(String[] args) {
       // 2 LineSegment objects.
        CartesianPoint cp1 = new CartesianPoint(1, 1);
        CartesianPoint cp2 = new CartesianPoint(3, 3);
       LineSegment line1 = new LineSegment(cp1, cp2);
       LineSegment line2 = new LineSegment(1, 4, 3, 4);
        System.out.println(line1);

       /*2 additional CartesianPoint objects (one that is on a line segment, one that is not on a line segment).*/
        CartesianPoint cp3 = new CartesianPoint(2, 2);
        CartesianPoint cp4 = new CartesianPoint(1, 3);

       /*Call the length and slope methods on each line segment and print out*/
        System.out.println("Line 1:");
        double len = line1.distance();
        double slope = line1.slope();
        System.out.println("The length of line segment line 1 is: " + len);
        System.out.println("The slope of line segment line 1 is: " + slope);
        System.out.println();

        System.out.println("Line 2:");
        len = line2.distance();
        slope = line2.slope();
        System.out.println("The length of line segment line 2 is: " + len);
        System.out.println("The slope of line segment line 2 is: " + slope);
        System.out.println();

        /*Call the isHorizontal method on each of the LineSegment objects and print out*/
        System.out.println("line 1:");
        System.out.println(line1.isHorizontal()? "The line segment line1 is horizontal."
                : "The line segment line1 is not horizontal.");
        System.out.println("line 2:");
        System.out.println(line2.isHorizontal()? "The line segment line2 is horizontal."
                : "The line segment line2 is not horizontal.");
        System.out.println();

       //Call the containsPoint method on a line segment twice and print out
        System.out.println(line1.containPoint(cp3)?
                "The point("+ cp3.getX() +"," +cp3.getY() + ") is on the line segment line1."
                : "The point("+ cp3.getX() +"," +cp3.getY() + ") is not on the line segment line1.");
        System.out.println(line1.containPoint(cp4)?
                "The point("+ cp4.getX() +"," +cp4.getY() + ") is on the line segment line1."
                : "The point("+ cp4.getX() +"," +cp4.getY() + ") is not on the line segment line1.");
    }
}
