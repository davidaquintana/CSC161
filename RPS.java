/*
    David Quintana & Hiiro (Hero) Uchino

    Summary: This program is the Rock Paper Scissors (RPS) Category of the Gamebox. The program prompts the user to pick a
    option between rock, paper or scissors and the program will pick a random option. The program follows the same simple
    rules as the real game.
 */

import java.util.*;


public class RPS
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Rock, Paper Scissors Category of the GameBox, Please enter 1 for a User experience and 2 for a Driver experience");
        Scanner sc = new Scanner(System.in);//creates scanner class
        int input = sc.nextInt();//stores user input
        if(input == 1)//dircects to user method
        {
            User();
        } else if(input == 2)//directs to driver method
        {
            Driver("rock");
            Driver("paper");
            Driver("scissors");
            Driver("Hello Grader");//invlaid input
        } else//edge case for invalid choices
        {
            System.out.println("Not a valid input");
        }
        sc.close();//closes scanner
    }
    static void User()
    {
        int min = 1;//min of range
        int max = 10;//max of range
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);//random int within range


        int progHand = -1;//program's hand
        int usHand = -1;//user's hand

        if(random_int <= 5)//int 1-5 are rock (50%)
        {
            progHand = 0; // rock
        } else if(random_int > 5 && random_int <= 7)//int 6-7 are paper (20%)
        {
            progHand = 1; // paper
        } else if(random_int > 7 && random_int <= 10)//int 8-10 are scissors(30%)
        {
            progHand = 2; // scissors
        }

        Scanner sc = new Scanner(System.in);//creates scanner class
        System.out.println("Welcome to RPS game, chose your hand (rock, paper, scissors)!");//prompts user
        String userHand = sc.next();//stores user choice

        if(userHand.equals("rock"))//if rock is chosen, usHand = 0
        {
            usHand = 0;
        } else if (userHand.equals("paper"))//if paper is chosen, usHand = 1
        {
            usHand = 1;
        } else if (userHand.equals("scissors"))//if scissors is chosen, usHand = 2;
        {
            usHand = 2;
        } else 
        {
            System.out.println("Error: Invalid Input");//edge case for invalid options
        }
        sc.close();//closes scanner

        if(usHand == progHand)
        {
            System.out.println("Draw, both you and the program selected the same hand");//draw
        } else if(usHand == 0 && progHand == 1)
        {
            System.out.println("You chose rock. The Program chose paper. You Lose.");//paper beats rock (program win)
        } else if (usHand == 0 && progHand == 2)
        {
            System.out.println("You chose rock. The Program chose scissors. You Win.");//rock beats scissors (user win)
        } else if (usHand == 1 && progHand == 0)
        {
            System.out.println("You chose paper. The Program chose rock. You Win.");//paper beats rock (user win)
        }else if (usHand == 1 && progHand == 2)
        {
            System.out.println("You chose paper. The Program chose scissors. You Lose.");//scissors beats paper (program win)
        } else if (usHand == 2 && progHand == 0)
        {
            System.out.println("You chose scissors. The Program chose rock. You Lose.");//rock beats scissors (program win)
        }else if (usHand == 2 && progHand == 1)
        {
            System.out.println("You chose scissors. The Program chose paper. You Win.");//scissors beats paper (user win)
        }
    }

    static void Driver(String userHand)
    {
        int min = 1;//min range value
        int max = 10;//max range value
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);//random integer within the range

        int progHand = -1;//progam's hand
        int usHand = -1;//user's hand

        if(random_int <= 5)//int 1-5 rock (50%)
        {
            progHand = 0; // rock
        } else if(random_int > 5 && random_int <= 7)//int 6-7 paper (20%)
        {
            progHand = 1; // paper
        } else if(random_int > 7 && random_int <= 10)//int 8-10 scissors (30%)
        {
            progHand = 2; // scissors
        }

        System.out.println("Welcome to RPS game!");//welcome

        if(userHand.equals("rock"))//0 equals rock
        {
            usHand = 0;
        } else if (userHand.equals("paper"))//1 equals paper
        {
            usHand = 1;
        } else if (userHand.equals("scissors"))//2 equals scissors
        {
            usHand = 2;
        } else {
            System.out.println("Error: Invalid Input");//edge case, invalid input
        }

        if(usHand == progHand)
        {
            System.out.println("Draw, both you and the program selected the same hand");//draw
        } else if(usHand == 0 && progHand == 1)
        {
            System.out.println("You chose rock. The Program chose paper. You Lose.");//paper beats rock (program win)
        } else if (usHand == 0 && progHand == 2)
        {
            System.out.println("You chose rock. The Program chose scissors. You Win.");//rock beats scissors (user win)
        } else if (usHand == 1 && progHand == 0)
        {
            System.out.println("You chose paper. The Program chose rock. You Win.");//paper beats rock (user win)
        }else if (usHand == 1 && progHand == 2)
        {
            System.out.println("You chose paper. The Program chose scissors. You Lose.");//scissors beats paper (program win)
        } else if (usHand == 2 && progHand == 0)
        {
            System.out.println("You chose scissors. The Program chose rock. You Lose.");//rock beats scissors (program win)
        }else if (usHand == 2 && progHand == 1)
        {
            System.out.println("You chose scissors. The Program chose paper. You Win.");//scissors beats paper (user win)
        }
    }
}