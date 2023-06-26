/*
    David Quintana & Hiiro (Hero) Uchino

    Summary: This program is the Palindrom (Array) Category of the Gamebox. The program has the user input a number 
    and the program states whether it is a palindrome or not.
 */

import java.util.*;
import java.util.Arrays;

public class PalindromeArray 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Palindrome Category of the GameBox, Please enter 1 for a User experience and 2 for a Driver experience");
        Scanner sc = new Scanner(System.in);//creates Scanner class
        int input = sc.nextInt();//stores user input
        if(input == 1)//calls User method
        {
            User();
        } else if(input == 2)//calls driver method
        {
            Driver(123);//not palindrome
            Driver(101);//palindrome
            Driver(1);//not a palindrome by length
        } else 
        {
            System.out.println("Not a valid input");//closes program
        }
        sc.close();//closes scanner
    }

    static void User()
    {
        System.out.println("Hello!! This program will decide if the number you enter is a Palindrome");
        System.out.println();
        System.out.print("Please enter your number: ");//prompts user for number
        Scanner in = new Scanner(System.in);//creates Scanner class
        
        int num = in.nextInt();//stores user input
        int length = String.valueOf(num).length();//find the length (digits) of the number
        
        int arr[] = new int[length];//creates an array with the size of length
        int arrRev[] = new int[length];//creates an array with the size of length
        
        int helper1 = 0;
        int helper2 = 0;

        if(length == 1)//edge case: a one digit number can not be a palindrome
        {
            System.out.println("Not a palindrome");
            System.exit(0);//exits program
        }

        while(num != 0)
        {
            arr[helper1] =num%10;//stores num mod 10 in arr, in cell that helper1 corresponds to
            num = num /10;//num is now equal to num/10
            helper1++;//add 1 to helper to move to the next cell of the array
        }//while loop ends when num is zerp

        for(int i = length -1; i >= 0; i--)
        {
            arrRev[helper2] = arr[i];//stores the last element in arr to the first in arrRev
            helper2++;//adds 1 to helper2 to move to the next cell
        }//for loop reverses arr

        if(Arrays.equals(arr, arrRev))//checks to see if the array is the same as itself reversed
        {
          System.out.println("Is a palindrome");//palindrome if true
        } else {
            System.out.println("is not a palindrome");//not a palindrom if false
        }
        in.close();//closes Scanner
    }

    static void Driver(int num)
    {
        System.out.println("Hello!! This program will decide if the number you enter is a Palindrome");
        
        int length = String.valueOf(num).length();//finds length (number of digits) of num
        int arr[] = new int[length];//creates arr array with the size of length
        int arrRev[] = new int[length];//creates arrRev array with the size of length
        
        int helper1 = 0;
        int helper2 = 0;
        
        int inNum = num;//for print statements

        if(length == 1)//edge case: 1 digit numbers cannot be palindrom
        {
            System.out.println(inNum + " is not a palindrome");//states number is not a palindrome
            System.exit(0);//exits
        } else {

            while(num != 0)
            {
                arr[helper1] =num % 10;//the cell that corresponds with helper1 is num mod 10
                num = num /10;//num is num/10
                helper1++;//adds one to helper to move to the next array cell
            }//while loop ends when number is zero

            for(int i = length -1; i >= 0; i--)
            {
                arrRev[helper2] = arr[i];//the last element in arr is the first in arrRev
                helper2++;//adds 1 to helper to move to the next array cell
            }//reverses arr

            if(Arrays.equals(arr, arrRev))//checks to see if arr is the same reversed    
            {
            System.out.println(inNum + " is a palindrome");//palindrome if true
            } else {
                System.out.println(inNum + " is not a palindrome");//not a palindrome if false
            }
        }
    }
}
