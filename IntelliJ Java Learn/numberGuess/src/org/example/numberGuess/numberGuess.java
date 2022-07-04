package org.example.numberGuess;

import java.util.Random;
import java.util.Scanner;

public class numberGuess {
    public static void numberGuesser(){
        Scanner sc = new Scanner(System.in);

        //generates random number
        Random random = new Random();
        int number = random.nextInt(10);
//        System.out.print("Random number is: " + number);
        //instructions of how the game works
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│You get 5 tries to guess the random number that has been generated between 0 and 10│");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────────┘");

        //setting the setting to false so the program works
        boolean answerGiven = false;

        //for loop to take input from user guessing the number
        for(int i=0; i<5; i++){
            System.out.print("Guess a number: ");
            int ansNumber = sc.nextInt();

            //statement if the guess number is right
            if(ansNumber == number){
                System.out.println("You guessed the number right!! It was "+number+"!!");
                answerGiven = true;
                break;
            //statement to say try again
            }else if(answerGiven != true && i<4){
                if(ansNumber>number){
                    System.out.print("(Guess Lower)");
                }else{
                    System.out.print("(Guess Higher)");
                }
                System.out.println("Try again");
            //statement to print the number if all tries were incorrect
            }else{
                System.out.println("┌────────────────────────────────────────┐");
                System.out.println("│The number was " +number+ "! Better luck next time!│");
                System.out.println("└────────────────────────────────────────┘");
            }
        }
    }

    public static void main(String[] args) {
        //scanner for main class
        Scanner sc = new Scanner(System.in);

        //title of game
        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("║Welcome to 'Guess the Random Number'!║");
        System.out.println("╚═════════════════════════════════════╝");
        //take name of player
        System.out.print("Enter you name: ");
        String name = sc.next();
        System.out.print("┌───────");
        for(int i=1; i<=name.length(); i++){
            System.out.print("─");
        }
        System.out.println("┐");
        System.out.println("|Hello " + name+"!|");
        System.out.print("└───────");
        for(int i=1; i<=name.length(); i++){
            System.out.print("─");
        }
        System.out.println("┘");
        System.out.print("Should we start the game?(y/n): ");

        char reply = sc.next().charAt(0);
        char posReply = 'y';

        if(reply == posReply){
            numberGuesser();
        }else{
            System.out.println("Exiting ...");
        }
    }
}
