package week5.A4;

/**
 * A4 Part1
 *This class is used to represent a room in a dormitory at a private boarding school for the performing arts.
 @author Wei Liu
 **/
public class DormRoom {
    /**
     The name of that building
    */
    private String buildingName;
    /**
     The room number
    */
   private int roomNum;
    /**
     The dorm room costs per year
     */
    private double cost;
/**
 * a constructor method (which initializes all three instance variables)
 @param buildingName  The name of that building
 @param roomNum The room number
 @param cost The dorm room costs per year
* */
    public DormRoom(String buildingName, int roomNum, double cost) {
        this.buildingName = buildingName;
        this.roomNum = roomNum;
        this.cost = cost;
    }
    /**
     This method retrieves the name of the building.
    *@return the name of the building
    **/
    public String getBuildingName() {
        return buildingName;
    }

    /**
     This method retrieves the number of the building.
    *@return the number of the building
    **/
    public int getRoomNum() {
        return roomNum;
    }
   /**
    This method retrieves the dorm room costs per year.
   *@return the dorm room costs per year
   **/
    public double getCost() {
        return cost;
    }
}
