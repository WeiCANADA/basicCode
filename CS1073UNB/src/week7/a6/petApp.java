package week7.a6;

import java.util.Scanner;
/**
 * This class is used to calculate a score to help someone determine what type of pet they should get.
 * @author Wei Liu
 */
public class petApp {
    public static void main(String[] args) {
        float squareF = 0;
        float distance = 0;
        float hours = 0;
        float age = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("How large is your living space (in square feet)?");
        if (scanner.hasNextFloat()) {
            squareF = scanner.nextFloat();
        }
        System.out.print("What is the distance from your home to work (in km)?");
        if (scanner.hasNextFloat()) {
            distance = scanner.nextFloat();
        }
        System.out.print("How many hours a day do you work outside your home? ");
        if (scanner.hasNextFloat()) {
            hours = scanner.nextFloat();
        }
        System.out.print("What is your age?");
        if (scanner.hasNextFloat()) {
            age = scanner.nextFloat();
        }
        // Call the giveAdvise method
        // pass the calculateScore method and hasPet method as the parameters
        giveAdvise(calculateScore(squareF, distance, hours, age, hasPet()));
    }

    /**
     * Give advise method
     * @param score  pass the the score
     * */
    private static void giveAdvise(int score) {
        if (score < 100) {
            System.out.println("You should not get any kind of pet!");
        } else if (score < 200) {
            System.out.println("You should get a hamster!");
        } else if (score < 300) {
            System.out.println("You should get a cat!");
        } else {
            System.out.println("You should get a dog!");
        }
    }

    /**
    * Calculate the score
     * @return score
     * @param age the age
     * @param distance the distance
     * @param hours the hours
     * @param squareF the living space (in square feet)
     * @param hasPet  whether you have a pet
    * */
    private static int calculateScore(Float squareF, Float distance, Float hours, Float age, boolean hasPet) {
        int score = 500;
        if (squareF > 2000) {
            score += 100;
        } else if (squareF >= 1500 && squareF <= 2000) {
            score -= 50;
        } else if (squareF < 1500) {
            score -= 100;
        }

        if (distance > 30 && hours > 6) {
            score -= 200;
        } else if (distance < 10 && hours < 4) {
            score += 150;
        }

        if (age > 60 || age < 25 && hasPet) {
            score -= 225;
        }
        return score;
    }

    /**
     * Determine whether the people have a pet
     * @return true(false) if you
     * (do not) have a pet
    * */
    public static boolean hasPet() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Do you currently own any other pets (yes or no)?");
            if (scanner.hasNext()) {
                String str = scanner.nextLine();
                if (str.equals("yes")) {
                    return true;
                } else if (str.equals("no")) {
                    return false;
                }
                System.out.println("Invalid input, try again! ");
            }
        }
    }
}
