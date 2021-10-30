package week7.A8;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class DwellingTest {
    public static void main(String[] args) {

        Dwelling d1 = new Dwelling("Andrew Yao", "Detached house", 1275, true);
        Dwelling d2 = new TownHouse("Leslie Valiant", "Town House", 798, false, true);
        Dwelling d3 = new TownHouse("Jonathan Tukey", "Town House", 798, true, false);
        Dwelling d4 = new HomeBusiness("Andrea Wang", "Home Business", 1467, true, 733);
        Dwelling d5 = new Dwelling("Adi Shamir", "Summer Cottage", 1093, false);
        Dwelling d6 = new HomeBusiness("Jean Sammit", "Home Business", 1680, false, 824);
        Dwelling d7 = new TownHouse("Beth Holberton", "Town House", 988, true, false);
        Dwelling d8 = new Dwelling("Radia Periman", "Apartment", 356, true);
        Dwelling d9 = new Dwelling("Barbara Liskov", "Mansion", 5287, true);
        Dwelling d10 = new HomeBusiness("Raj Reddy", "Home Business", 2270, false, 1035);
        System.out.printf(d1 + "\t\t$%.2f\n", d1.calInsurance(3.98));
        System.out.printf(d2 + "\t\t\t$%.2f\n", d2.calInsurance(3.98));
        System.out.printf(d3 + "\t\t\t$%.2f\n", d3.calInsurance(3.98));
        System.out.printf(d4 + "\t\t\t$%.2f\n", d4.calInsurance(3.98));
        System.out.printf(d5 + "\t\t\t$%.2f\n", d5.calInsurance(3.98));

    }
}
