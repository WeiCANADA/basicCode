package week5.tutorail;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-10-08 1:17 p.m.
 */
public class Faculty{
    private String name;
    private double fee;
    public Faculty(String name, double fee){
        this.name = name;
        this.fee = fee;
    }
    public String getName(){
        return name;
    }
    public void setName(String nameIn){
        name = nameIn;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double feeIn){
        fee = feeIn;
    }
    public double getFee(boolean fullTime){
        double calcFee;
        if(fullTime){
            calcFee = fee;
        }
        else{
            calcFee = fee/2;
        }
        return calcFee;
    }
}
