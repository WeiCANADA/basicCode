package week5.tutorail;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-10-08 1:19 p.m.
 */
public class StudentDriver{
    public static void main(String[] args){
        double tuition = 4570;
        double courseRate = 710;
        double fee = 40;
        University unb = new University("UNB", tuition, courseRate);
        Faculty fcs = new Faculty("Faculty of Computer Science", fee);
        fee += 20;
        Faculty fadmin = new Faculty("Faculty of Business Administration", fee);
        tuition += 200;
        Student stud1 = new Student("Jane", 1234567, fcs, unb, 6);
        fcs.setFee(35);
        University unbF = unb;
        unbF.setName("UNBF");
        unb = new University("UNB", tuition, courseRate);
        Student stud2 = new Student("John", 9876543, fadmin, unb, 3);
        System.out.println(stud1);
        System.out.println(stud2);
    }
}
