package week4.A3;
/**
 This class represents a pine tree at a Christmas tree farm.
 @author Wei Liu 3718446
 */
public class PineTree {
    /**
     The name of the tree lot where this tree will be sold
     when it is harvested.
     */
    private String treeLot;
    /**
     The age of the tree (in years).
     */
    private int treeAge;

    /**
     This method constructs a PineTree with the specified
     tree lot and age.
     @param lotIn the name of the designated tree lot.
     @param ageIn the age of the tree (in years).
     */
    public PineTree(String lotIn, int ageIn) {
        this.treeLot = lotIn;
        this.treeAge = ageIn;
    }

    /**
     This method retrieves the name of the tree lot where
     we plan to sell this tree.
     @return the name of the tree lot.
     */
    public String getTreeLot() {
        return treeLot;
    }

    /**
     This method retrieves the age of the tree.
     @return the age of the tree (in years).
     */
    public int getTreeAge() {
        return treeAge;
    }

    /**
     This method computes and returns the number of boughs
     this tree is estimated to have at its current age.
     @return the number of boughs.
     */
    public int boughs(){
        return 3*treeAge;
    }

    /**
     This method is called to change the designated tree lot
     for this tree.
     @param lotIn The name of the newly designated tree lot.
     */
    public void setTreeLot(String newTreeLot) {
        this.treeLot = newTreeLot;
    }

    /**
     This method is called to increment the age of the tree
     by one year.
     */
    public void addOneYear(){
        this.treeAge +=1;
    }
}
