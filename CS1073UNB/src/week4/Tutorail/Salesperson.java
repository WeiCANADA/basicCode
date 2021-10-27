package week4.Tutorail;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-10-01 12:29 p.m.
 */
public class Salesperson {
    private double hours;
    private String name;
    private double wage;

    public Salesperson(String name, double wage) {
        this.name = name;
        this.wage = wage;
        this.hours = 0;
    }

    public double getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculatePay(){
        double pay = wage * hours;
        hours = 0;
        return pay;
    }

    public void addHours(double hoursWorked){
        this.hours += hoursWorked;
    }


}
