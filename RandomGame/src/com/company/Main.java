package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Random Game!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Would you like to start the game?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int answerNr = scanner.nextInt();

        while (answerNr != 1) {
            System.out.println("Would you like to start the game?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            answerNr = scanner.nextInt();
        }


        //Random Game generator created:
        Random random = new Random(); // First define Random class with name 'random'
        int x = random.nextInt(20) + 1;//then set the parameters for the random numbers (between 1 & 20)
        System.out.println("Please guess a number from 1 to 20: ");//then we ask user to make a guess
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        //while loop reads like this:
        while (!shouldFinish) { // as long as the condition'should finish' is not met the loop continues
            timesTried++; // by adding the 'times tried' each time

            if (timesTried < 5) { // if the tries are less than 5 and
                if (userInput == x) {// user has entered the right number
                    hasWon = true;// the condition for winning is met
                    shouldFinish = true;// and condition 'should finish' stops the while loop.
                }else  if (userInput > x) {// if user guesses incorrectly higher, then this condition happens
                    System.out.println("Guess lower");
                    userInput = scanner.nextInt();
                }else {// if user guesses incorrectly lower, then this condition happens
                    System.out.println("Guess higher");
                    userInput = scanner.nextInt();
                }

            }else {
                shouldFinish = true; // if after 5 times user has not guessed correctly, this condition is achieved.
            }
        }
        if (hasWon) {
            System.out.println("Congratulations! You have guessed in " + timesTried + "tries");
        }else {
            System.out.println("Game over!");
            System.out.println("The number was: " + x);
        }
    }
}
