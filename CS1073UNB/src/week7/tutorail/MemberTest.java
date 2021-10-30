package week7.tutorail;


import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MemberTest {
    public static void main(String[] args) {
        Member vIP1 = new VIPMember("Mary", "CC", "LB", 123, true, true);
        Member vIP2 = new VIPMember("Cary", "CC", "LB", 321, false, true);
        Member m1 = new Member("Terry", "CC", 223, true);
        Member m2 = new Member("Perry", "CC", 223, false);
        Member m3 = new Member("Nary", "CC", 224, true);

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setCurrency(Currency.getInstance(Locale.CANADA));
        //System.out.println(nf.format(34.5));
        System.out.println(vIP1 + nf.format(vIP1.calCost()));
        System.out.println(vIP2 + nf.format(vIP2.calCost()));
        System.out.println(m1 + nf.format(m1.calCost()));
        System.out.println(m2 + nf.format(m2.calCost()));
        System.out.println(m3 + nf.format(m3.calCost()));
        if (m1.compare(m2)) {
            System.out.println("They are same members.");
        } else {
            System.out.println("They are not same members.");
        }
        if (vIP1.compare(vIP2)) {
            System.out.println("They are same members.");
        } else {
            System.out.println("They are not same members.");
        }
    }
}
