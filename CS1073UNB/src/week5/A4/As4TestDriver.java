package week5.A4;

/**
 * @description: A4 Part3
 * A test class for the codes of Part1 and Part2
 * @author: Wei Liu
 * @date: 2021-10-06 2:56 p.m.
 */
public class As4TestDriver {
    public static void main(String[] args) {

        /*
        *Monika Schulz
         */
        DormRoom room1 = new DormRoom("Ethel Merman House",263,9725.55);
        Student s1 = new Student("Monika Schulz",5960.00,278.30,2500.00, room1);
       /*
       * Miguel Florez
       */
        DormRoom room2 = new DormRoom("Jason Robert Brown House", 620, 10950.00);
        Student s2 = new Student("Miguel Florez", 5250.00,695.85, 0, room2);
        /*
        *Katharine Doucet
        * */
        DormRoom room3 = new DormRoom("Josephine Baker House",116,8750.65);
        Student s3 = new Student("Katharine Doucet", 5565.50, 0, 3850.00, room3);

        /*Monika  activities cost is now $358.80.*/
        s1.setActivitiesAmount(358.80);
        /*Miguel  now lives in room 1017
        of Arthur Asher Miller House
         and his new room costs $11500.00 per year.*/
        DormRoom room22 = new DormRoom("Arthur Asher Miller House",1017,11500.00);
        s2.setRoom(room22);
        /*Katharine tuition amount is now $5400.00 for the year.*/
        s3.setTuitionAmount(5400.00);
        /*
         *Monika Schulz
         */
        System.out.println(s1.getOnSiteMailLabel());
        System.out.println("TotalFeesOwing:" + s1.getTotalFeesOwing());
        System.out.println();
        /*
         * Miguel Florez
         */
        System.out.println(s2.getOnSiteMailLabel());
        System.out.println( "TotalFeesOwing:" + s2.getTotalFeesOwing());
        System.out.println();
        /*
         *Katharine Doucet
         * */
        System.out.println(s3.getOnSiteMailLabel());
        System.out.println("TotalFeesOwing:" + s3.getTotalFeesOwing());
    }
}
