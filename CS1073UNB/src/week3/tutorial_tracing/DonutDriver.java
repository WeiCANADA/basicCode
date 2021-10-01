package week3.tutorial_tracing;

public class DonutDriver {
    public static void main(String[] args) {
        DonutStore tims = new DonutStore("Tim Hortons");
        tims.buyStock(35);
        DonutStore dunkin = new DonutStore("Dunkin Donuts");
        dunkin.buyStock(18);
        System.out.print(tims.getName());
        System.out.print("\tStock: " + tims.getStock());
        System.out.println();
        System.out.print(dunkin.getName());
        System.out.print("\tStock: " + dunkin.getStock() + "\n");
        System.out.println();
        dunkin.makeSales(11);
        tims.makeSales(5);
        dunkin.makeSales(3);
        dunkin.buyStock(10);
        System.out.println(dunkin);
        System.out.println(tims);
        System.out.println();
        tims.buyStock(12);
        tims.makeSales(9);
        dunkin.makeSales(6);
        System.out.println(dunkin);
        System.out.println(tims);
        System.out.println();
    }
}
