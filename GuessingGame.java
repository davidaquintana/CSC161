/*
    David Quintana & Hiiro (Hero) Uchino

    Summary: This program is the Guessing Game Category of the Gamebox. The program has the user input a number 
    and the program guesses the number based on whether the user enters "lower" or "higher". The code always 
    finds the halfway point and uses that method to guess the number
 */

import java.util.*;

public class GuessingGame
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Guessing Game Category of the GameBox, Please enter 1 for a User experience and 2 for a Driver experience");//intro
        Scanner sc = new Scanner(System.in);//creates new Scanner class
        int input = sc.nextInt();//stores users input
        if(input == 1)
        {
            User();//calls user method
        } else if(input == 2)
        {
            Driver(123);//driver: out of range
            Driver(1);//driver: lower than guess
            Driver(50);//driver: correct guess
            Driver(60);//driver: higher than guess

        } else//ends program if user does not input a valid option
        {
            System.out.println("Not a valid input");
        }
        sc.close();//closes Scanner
    }

    static void User()//User method
    {
        double max = 100;//max number in range
        double min = 1;//min number in range
        double guess = 50;//initial guess, half of the max and min

        System.out.println("Welcome to the Guessing Game!!");
        System.out.println("Please enter a a number for the program to guess");
        Scanner in = new Scanner(System.in);//creates new Scanner class
        double num = in.nextDouble();//stores user's num
          
        while(guess != num)//while the number is not gussed by the prgram
        {
            if(num > 100 || num < 1)
            {
                do
                {
                    System.out.println("Invalid Input, try again.");
                    num = in.nextDouble();
                }while (num > 100 || num < 1);//Keeps asking user for a valid input, if output is invalid
            } else {
                System.out.println("Our guess was incorrect, is it lower or higher than: " + guess);//prompts user to respond if their number is lower or higher
                String higherLower = in.next();//stores answer
        
            if(higherLower.equals("higher"))//if higher
            {
                min = guess;//new minimuim was the programs previous guess
                guess = Math.ceil((min + max)/2);//new guess is the number inbetween the updated min and the max
            } else if(higherLower.equals("lower"))//if higher
                {
                    max = guess;//new max is the programs previous guess
                    guess = Math.floor((min + max)/2);//new guess is the number inbetween the updated max and the min
                }
            }
        }//while loop breaks when guess is correct
        System.out.println("We have guessed your number!! : " + guess);//prompts user that the program has gussed the number
        in.close();//closes scanner
    }

    static void Driver(int num)
    {
        double max = 100;//max of acceptable range
        double min = 1;//min of acceptable range
        double guess = 50;//initial guess
        System.out.println("Welcome to the Guessing Game!!");
          
        if(num > 100 || num < 1)
        {
            System.out.println("Invalid Input");//edge case of invalid input
        } else {
            while(guess != num)//while the program has not guessed the number
            {
                if(guess < num)//if less than number
                {
                    System.out.println("Our guess was " + guess + " which is lower, we will now guess higher");
                    min = guess;//new min is the guess
                    guess = Math.ceil((max + min)/2);//new guess is the number between updayed min and max
                } else if(guess > num)//if more than number
                {
                    System.out.println("Our guess was " + guess + " which is higher, we will now guess lower");
                    max = guess;//updated max
                    guess = Math.floor((max + min)/2);//new guess is the number between the updated max and min
                }
            }//while loop breaks when num was gussed by program
            System.out.println("The program has guessed your number : " + num);//prompts user that the num was guessed
        }
    }
}    
