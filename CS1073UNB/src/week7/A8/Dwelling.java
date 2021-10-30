package week7.A8;

public class Dwelling {
    private String owner;
    private String type;
    private int size;
    private boolean hasFirePlace;

    public Dwelling(String owner, String type, int size, boolean hasFirePlace) {
        this.owner = owner;
        this.type = type;
        this.size = size;
        this.hasFirePlace = hasFirePlace;
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
    public double calInsurance(double rate){
        return hasFirePlace? rate * this.size + 150 : rate * this.size;
    }

    @Override
    public String toString() {
        return "Owner's Name & Dwelling Type\t" + "Dwelling size\t" + "Insurance Cost\n" +
                "=========================== \t" + "==============\t" + "==============\n" +
                owner + " (" + type + ")\t\t\t" + size;
    }
}
