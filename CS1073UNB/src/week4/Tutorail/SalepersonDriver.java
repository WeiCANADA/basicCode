package week4.Tutorail;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-10-01 12:37 p.m.
 */
public class SalepersonDriver {
    public static void main(String[] args) {
        String name = "Superhero";
        Salesperson tom = new Salesperson(name, 12);
        double wage = 15;
        Salesperson jen = new Salesperson("Mermaid", wage);


        name = "Dinosaur";
        wage = 20;
        Salesperson son = tom;
        tom.setWage(6);
        jen.setName("Unicorn");



        System.out.println(tom.getName()+ tom.getWage());
        System.out.println(jen.getName()+ jen.getWage());
        System.out.println(son.getName()+ son.getWage());
        /*
    Kyle
	Hours: 10.0
	Pay: $112.5
         */

    }
}
