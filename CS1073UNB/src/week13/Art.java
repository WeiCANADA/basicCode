package week13;

import java.text.NumberFormat;

public class Art {
    private final String name;
    private final String type;
    private double value;
    private final int ID;
    private static int uniqueID = 50;

    public Art(String name, String type, double value) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.ID = uniqueID;
        uniqueID++;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public static void setUniqueID(int uniqueID) {
        Art.uniqueID = uniqueID;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        NumberFormat fml = NumberFormat.getCurrencyInstance();
        return "Name: "+ name + " " + "Type: " + type + " "+ "Value: " + fml.format(value) + " "+ "ID: "+ ID ;
    }
}