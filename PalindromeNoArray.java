/*
    David Quintana & Hiiro (Hero) Uchino

    Summary: This program is the Palindrom (No Array) Category of the Gamebox. The program has the user input a number 
    and the program states whether it is a palindrome or not.
 */

import java.util.*;

public class PalindromeNoArray
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Palindrome (no array) Category of the GameBox, Please enter 1 for a User experience and 2 for a Driver experience");
        Scanner sc = new Scanner(System.in);//creates Scanner class
        int input = sc.nextInt();//stores input
        if(input == 1)//user method
        {
            User();
        } else if(input == 2)//driver method
        {
            Driver(123);//not palindrome
            Driver(1);//palindrome
            Driver(121);//palindrome
        } else//invalid input
        {
            System.out.println("Not a valid input");
        }
        sc.close();//closes scanner
    }

    static void User()
    {
        System.out.println("Enter an integer to see if it is a palindrome");//prompts input
        
        Scanner in = new Scanner(System.in);//creates scanner class
        int pal = in.nextInt();//stores user input
        
        int helper = 0;
        int temp = pal;
        
        while (pal != 0)
        {
            int rem = pal % 10;//remainder is pal mod 10
            helper = helper * 10 + rem;//helper is helper * 10 + remainder
            pal = pal / 10;//pal(input) divided by 10
        }//while loop ends whel pal equals 0

        
        if(helper == temp)//if the helper is equal to the temp value(og user input)
        {
            System.out.println(temp + " is a Palindrome");//palindrome if true
        } else {
            System.out.println(temp + " is not a Palindrome");//not a palindrome if false
        }
        in.close();//closes scanner class
    }

    static void Driver(int pal)
    {
        int helper = 0;
        int temp = pal;
        
        while (pal != 0)
        {
            int rem = pal % 10;//remainder is pal mod 10
            helper = helper * 10 + rem;//helper is helper * 10 + remainder
            pal = pal / 10;//pal (input) divided by 10
        }//while loop ends when pal is equal to 0

        
        if(helper == temp)//if the helper is equal to the temp value(original user input)
        {
            System.out.println(temp + " is a Palindrome");//palindrome if true
        } else {
            System.out.println(temp+ " is not a Palindrome");//not a palindrome if false
        }
    }
}