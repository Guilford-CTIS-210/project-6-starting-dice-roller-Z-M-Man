package edu.guilford;
//Mark Man
//09-19-24

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        //Prompts user to input # of dice sides and # of dice
        System.out.print("This will roll dice and sum them up. How many sides should a dice have? Sides: ");
        int sides = scan.nextInt();
        System.out.print("How many dice to roll? Dice: ");
        int number = scan.nextInt();
        int sum = 0;

        //for loop that runs 'number' times, rolling a die with given sides and adding them up
        for (int i = 0; i < number; i++) { //Count starts at 0, goes up by 1 every step, and ends at 'number'
            int diceRoll = rand.nextInt(1,sides + 1);
            sum += diceRoll;
            //System.out.println("Sum of " + i + "d" + sides + " = " + sum);
        }

        System.out.println("Sum of " + number + "d" + sides + " = " + sum); //Prints the sum after loop ends
        scan.close(); //Always do this at end of method
    }
}