package week7.A8;

import java.text.NumberFormat;

/**
 * a test driver  that exercises many of the methods from the Dwelling, TownHouse, and HomeBusiness classes.
 *
 * @author Wei Liu
 */
public class InsuranceCalculator {
    public static void main(String[] args) {

        Dwelling d1 = new Dwelling("Andrew Yao", "Detached house", 1275, true);
        Dwelling d2 = new TownHouse("Leslie Valiant", "Town House", 798, false, true);
        Dwelling d3 = new TownHouse("Jonathan Tukey", "Town House", 835, true, false);
        Dwelling d4 = new HomeBusiness("Andrea Wang", "Home Business", 1467, true, 733);
        Dwelling d5 = new Dwelling("Adi Shamir", "Summer Cottage", 1093, false);
        Dwelling d6 = new HomeBusiness("Jean Sammit", "Home Business", 1680, false, 824);
        Dwelling d7 = new TownHouse("Beth Holberton", "Town House", 988, true, false);
        Dwelling d8 = new Dwelling("Radia Perlman", "Apartment", 356, true);
        Dwelling d9 = new Dwelling("Barbara Liskov", "Mansion", 5287, true);
        Dwelling d10 = new HomeBusiness("Raj Reddy", "Home Business", 2270, false, 1035);

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.print("Owner's Name & Dwelling Type\t" + "Dwelling size\t" + "Insurance Cost\n" +
                "===========================\t\t" + "=============\t" + "==============\n");
        System.out.println(d1 + "\t\t\t" + nf.format(d1.calInsurance(3.98)));
        System.out.println(d2 + "\t\t\t\t" + nf.format(d2.calInsurance(4.13)));
        System.out.println(d3 + "\t\t\t\t" + nf.format(d3.calInsurance(4.13)));
        System.out.println(d4 + "\t\t\t" + nf.format(d4.calInsurance(4.13)));
        System.out.println(d5 + "\t\t\t" + nf.format(d5.calInsurance(3.17)));
        System.out.println(d6 + "\t\t\t" + nf.format(d6.calInsurance(2.98)));
        System.out.println(d7 + "\t\t\t\t" + nf.format(d7.calInsurance(4.95)));
        System.out.println(d8 + "\t\t\t\t" + nf.format(d8.calInsurance(4.95)));
        System.out.println(d9 + "\t\t\t" + nf.format(d9.calInsurance(3.76)));
        System.out.println(d10 + "\t\t\t" + nf.format(d10.calInsurance(4.76)));
    }
}
