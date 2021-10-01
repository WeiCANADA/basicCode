package week4.A3;
/*
 * A3 Q2 PartB write a FunZoneDriver.java
 * @author Wei Liu 3718446
 * */
public class FunZoneDriver {
    public static void main(String[] args) {
        /* Karl`s badge number is 12341234. Create a FunZoneBadge object called karlsBadge*/
        FunZoneBadge karlsBadge = new FunZoneBadge("Karl", 12341234);
        //Karl plays a game of laser tag, which costs 6.00.
        karlsBadge.calculateTotalCharges(6.00);
        /* Maria Lopez arrives next and gets a badge with the number 24681357;
        call this object variable mariasBadge.
        Maria scans her badge to access the trampoline park for 7.25.*/
        FunZoneBadge mariasBadge = new FunZoneBadge("Maria", 24681357);
        mariasBadge.calculateTotalCharges(7.25);
        /*Ben Landry is issued a badge with the number 34510106; call this object variable bensBadge.*/
        FunZoneBadge bensBadge = new FunZoneBadge("Ben",34510106);
        //Ben costs 2.75
        bensBadge.calculateTotalCharges(2.75);
       /*Lori Evans got a badge with the number 57986422; call this object variable lorisBadge.*/
        FunZoneBadge lorisBadge = new FunZoneBadge("Lori", 57986422);
        //Lori accesses the climbing wall for a cost of 12.50
        lorisBadge.calculateTotalCharges(12.5);
        //Lori costs18.75.
        lorisBadge.calculateTotalCharges(18.75);
        //Maria visits the build your own sundae bar, which has a cost of 6.50.
        mariasBadge.calculateTotalCharges(6.50);
        //Karl and Ben cost  9.50 per person.
        karlsBadge.calculateTotalCharges(9.50);
        bensBadge.calculateTotalCharges(9.50);

        /*each of the four FunZoneBadge objects print out
        the badge holder's name, the badge number, and the current total charges.*/
        System.out.println("The first badge holder information:");
        System.out.println("Holder Name: " + karlsBadge.getHolderName() +'\t'
                + "Badge number:" + karlsBadge.getBadgeNum() +'\t'
                + "Total charges: $" + karlsBadge.getTotalCharges() + ".\n");

        System.out.println("The second badge holder information:");
        System.out.println("Holder Name: " + mariasBadge.getHolderName() +'\t'
                + "Badge number:" + mariasBadge.getBadgeNum() +'\t'
                + "Total charges: $" + mariasBadge.getTotalCharges() + ".\n");

        System.out.println("The third badge holder information:");
        System.out.println("Holder Name: " + bensBadge.getHolderName() +'\t'
                + "Badge number:" + bensBadge.getBadgeNum() +'\t'
                + "Total charges: $" + bensBadge.getTotalCharges() + ".\n");

        System.out.println("The forth badge holder information:");
        System.out.println("Holder Name: " + lorisBadge.getHolderName() +'\t'
                + "Badge number: " + lorisBadge.getBadgeNum() +'\t'
                + "Total charges: $" + lorisBadge.getTotalCharges() + ".");


    }
}
