package week4.A3;
/*
 * A3 Q2 PartA write a FunZoneBadge.java
 * @author Wei Liu 3718446
 * */

public class FunZoneBadge {

    //3 instances variables
    private String holderName;
    private int badgeNum;
    private double totalCharges;

    //1 constructor and initialize the instance variables.
    public FunZoneBadge(String holderName, int badgeNum) {
        this.holderName = holderName;
        this.badgeNum = badgeNum;
        this.totalCharges = 0;
    }

    //3 simple accessor methods
    public String getHolderName() {
        return holderName;
    }

    public int getBadgeNum() {
        return badgeNum;
    }

    public double getTotalCharges() {
        return totalCharges;
    }

  /*a mutator method adds the price of that offering to the badge's balance owing.
   The price is the parameter.*/
    public void calculateTotalCharges (double totalCharges){
        this.totalCharges += totalCharges;
    }
    /*accessor method that will calculate and return the donation amount when given a percentage*/
    /**
    *@description //TODO donationAmount
    *@Param [percentage]
    *@return double
    **/
    public double donationAmount(double percentage){
        return totalCharges * percentage;
    }
}
