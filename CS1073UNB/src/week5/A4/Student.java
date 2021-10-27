package week5.A4;
/**
 * A4 Part2
 * This class will be used to represent a student who is enrolled at this boarding school
  @author Wei Liu
 */
public class Student {
    /**
     The full name of the student (e.g. Jane Doe)
     **/
    private String name;
    /**
     *  The amount that this student will pay per year for the program that they have selected.
     **/
    private double tuitionAmount;
    /**
     * The amount that this student will pay per year for the extra-curricular activities that they have selected.
     **/
    private double activitiesAmount;
    /**
     * The amount of scholarship money awarded to this student for the current year (e.g. 2500.00)
     **/
    private double scholarshipAmount;
    /**
     * The dorm room within the boarding school where this student is currently living
     * (Note: use the class that you created in part I.)
     **/
    private DormRoom dormRoom;

    /**
     * Provide a constructor method that will initialize all of the instance variables.
     *
     * @param name      The full name of the student
     * @param tuitionAmount     The amount that this student will pay per year for the program that they have selected.
     * @param activitiesAmount   The amount that this student will pay per year for the extra-curricular activities that they have selected.
     * @param scholarshipAmount     The amount of scholarship money awarded to this student for the current year.
     * @param dormRoom      The dorm room within the boarding school where this student is currently living.
     */
    public Student(String name, double tuitionAmount, double activitiesAmount, double scholarshipAmount, DormRoom dormRoom) {
        this.name = name;
        this.tuitionAmount = tuitionAmount;
        this.activitiesAmount = activitiesAmount;
        this.scholarshipAmount = scholarshipAmount;
        this.dormRoom = dormRoom;
    }

    /**
     * This method is called to change the designated student name for this name.
     * @param name The designated student name
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method is called to change the designated  tuitionAmount for this tuitionAmount.
     *@param tuitionAmount The designated tuitionAmount
     **/
    public void setTuitionAmount(double tuitionAmount) {
        this.tuitionAmount = tuitionAmount;
    }

    /**
     *This method is called to change the designated  activitiesAmount for this activitiesAmount.
     @param activitiesAmount The designated activitiesAmount
     **/
    public void setActivitiesAmount(double activitiesAmount) {
        this.activitiesAmount = activitiesAmount;
    }

    /**
     *This method is called to change the designated  scholarshipAmount for this scholarshipAmount.
     *
     @param scholarshipAmount The designated scholarshipAmount
     **/
    public void setScholarshipAmount(double scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    /**
     *This method is called to change the designated  dormRoom for this dormRoom.
     @param dormRoom The designated dormRoom
     **/
    public void setRoom(DormRoom dormRoom) {
        this.dormRoom = dormRoom;
    }

    /**
     * getTotalFeesOwing method
     * This method will return the total fees that must be paid to the boarding school this year;
     * this takes into account the tuition, activities and dormitory fees,
     * as well as the financial support that the student will receive through scholarships
     * @return  the total fees
     **/
    public double getTotalFeesOwing() {
        return this.dormRoom.getCost() + tuitionAmount + activitiesAmount + scholarshipAmount;
    }

    /**

     * getOnSiteMailLabel method
     * This method will return a textual string that includes the student's name
     * and school residence location (building and room number);
     * the string should be in the following format:
     * Jane Doe
     * Richard Rodgers Hall, room 628
     * @return the Dorm room information
     **/
    public String getOnSiteMailLabel() {
        return name + '\n' + this.dormRoom.getBuildingName() + ", room " + this.dormRoom.getRoomNum();
    }
}
