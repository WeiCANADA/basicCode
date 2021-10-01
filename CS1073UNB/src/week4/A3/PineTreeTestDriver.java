package week4.A3;
/*
* A3 Q1 PartB write a PineTreeTestDriver.java
* @author Wei Liu 3718446
* */
public class PineTreeTestDriver {
    public static void main(String[] args) {
        //1. Create three PineTree objects.
        PineTree pineTree1 = new PineTree("A",1);
        PineTree pineTree2 = new PineTree("B",2);
        PineTree pineTree3 = new PineTree("C",3);

        //2.Change the name of the designated tree lot for the second PineTree object.
        pineTree2.setTreeLot("BB");

        //3.Record the fact that the third PineTree object has completed one more year of growth.
        pineTree3.addOneYear();

        /* 4. Print out the name of the designated tree lot, the age,
        and the estimated number of boughs for each PineTree object*/
        System.out.println("The information of the first tree:");
        System.out.println("Tree Lot is: " + pineTree1.getTreeLot() + ";" +'\n'
        +"Tree Age is: " + pineTree1.getTreeAge() + ";" + '\n'
        +"Tree boughs are: " + pineTree1.boughs() + "." + '\n');

        System.out.println("The information of the second tree:");
        System.out.println("Tree Lot is: " + pineTree2.getTreeLot() + ";" +'\n'
                +"Tree Age is: " + pineTree2.getTreeAge() + ";" + '\n'
                +"Tree boughs are: " + pineTree2.boughs() + "." + '\n');

        System.out.println("The information of the third tree:");
        System.out.println("Tree Lot is: " + pineTree3.getTreeLot() + ";" +'\n'
                +"Tree Age is: " + pineTree3.getTreeAge() + ";" + '\n'
                +"Tree boughs are: " + pineTree3.boughs() + "." + '\n');


    }
}
