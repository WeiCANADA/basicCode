package week3.tutorial_tracing;

public class DonutStore {
    private String name;
    private int stock;
    private double sales;
    public DonutStore(String nameIn){
        name = nameIn;
        stock = 0;
        sales = 0;
    }
    public String getName(){
        return name;
    }
    public int getStock(){
        return stock;
    }
    public double getSales(){
        return sales;
    }
    public void buyStock(int stockIn){
        stock = stock + stockIn;
    }
    public void makeSales(int stockSold){
        stock = stock - stockSold;
        sales = sales + stockSold * 2.50;
    }
    public String toString(){
        return name + "\n\tStock: " + stock + "\n\tSales: $" + sales;
    }
}
