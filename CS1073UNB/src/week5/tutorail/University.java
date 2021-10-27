package week5.tutorail;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-10-08 1:18 p.m.
 */
public class University{
    private double tuition;
    private double courserate;
    private String name;
    public University(String name, double tuition, double courserate){
        this.name = name;
        this.tuition = tuition;
        this.courserate = courserate;
    }
    public double getTution(){
        return tuition;
    }
    public double getCourseRate(){
        return courserate;
    }
    public String getName(){
        return name;
    }
    public void setName(String nameIn){
        name = nameIn;
    }
}