/**
 * Created by D.Cisero on 7/13/17.
 */

import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main (String [] arg) {
        Scanner scan = new Scanner(System.in);
        Random randGen = new Random();

        int userInput = 1;
        String answer = "Y";

        do {
            System.out.println("Welcome to the Grand Circus Casino!");
            System.out.println();

            System.out.print("How many sides should each die have? ");
            userInput = scan.nextInt();
            System.out.println();

            System.out.println("Roll 1: ");
            System.out.println(random(userInput));
            System.out.println(random(userInput));
            System.out.println();

            System.out.println("Would you like to roll again? Please press (y/n)");
            answer = scan.next();

        }
        while (answer.equalsIgnoreCase("Y"));

        }
        public static int random ( int userInput){
            Random randGen = new Random();
            return (randGen.nextInt(userInput) + 1);

        }




}
