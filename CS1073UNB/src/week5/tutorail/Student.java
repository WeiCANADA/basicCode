package week5.tutorail;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-10-08 1:17 p.m.
 */
public class Student{
    private University university;
    private String name;
    private long id;
    private boolean fullTime;
    private Faculty faculty;
    private int numCourses;
    public Student(String name, long id, Faculty faculty,
                   University university, int numCourses){
        this.name = name;
        this.id = id;
        this.faculty = faculty;
        this.university = university;
        this.numCourses = numCourses;
        if(numCourses <= 3){
            fullTime = false;
        }
        else{
            fullTime = true;
        }
    }
    public double calcCost(){
        double cost;
        if(fullTime){
            cost = university.getTution() + faculty.getFee(fullTime);
        }
        else{
            cost = numCourses * university.getCourseRate() +
                    faculty.getFee(fullTime);
        }
        return cost;
    }
    public String toString(){
        return name + "\n\tId: " + id + "\n\t" + university.getName() +
                ", " + faculty.getName() + "\n\t" +
                (fullTime?"Full ":"Part ") + "Time\n\t$" + calcCost();
    }
}
