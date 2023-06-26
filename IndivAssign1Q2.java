/*
    David Quintana
    Individual Assignment 1, Question 2

    Ths program has predetermined arrays that are added together using the summation process we are accustmed to.
    If digits go beyond ten, the number is then carried and will be added to the next element of the array
 */

import java.util.*;

public class IndivAssign1Q2
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Question 3 of the Individual Assignment, in this section you will be adding two arrays together with basic addition rules");
        System.out.println("Please enter 1, 2, 3 or 4 (all test cases) to determine which Test Case you would like to see");
        Scanner in = new Scanner(System.in);//creates scanner class
        int input = in.nextInt();

        if(input == 1)
        { 
            testCase1();//no carry
        } else if(input == 2)
        {
            testCase2();//carry
        } else if(input == 3)
        {
            testCase3();//carry
        } else if(input == 4)
        {
            testCase1();
            testCase2();
            testCase3();
        }else
        {
            System.out.println("Invalid Input");//edge case
        }
        in.close();//closes scanner class
    }

    static void testCase1()
    {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 1, 1, 1, 1};
        ArrayList<Integer> arr3 = new ArrayList<Integer>();

        int carry = 1;
        int rem = 0;
        int helper = 0;


        System.out.println("Welcome to Test Case 1: ");//presentation
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");//prints out arr1
        }

        System.out.println();

        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");//prints out arr2
        }

        for(int i = arr1.length - 1; i >= 0; i--)
        {
            arr3.add(arr1[i] + arr2[i]);//creates an array list with the summation of arr1[i] + arr2[i], until the arrays are finished
        }

        do
        {
            if(arr3.get(helper) < 10)
            {
                helper++;//adds one to helper to move across the arraylist
            } else
            {
                if(arr3.get(arr3.size() - 1) > 9)
                {
                    arr3.add(carry);//if the last digit is larger than 10 it will add an element to carry
                }

                if(helper <= arr3.size()-2)
                {
                    rem = arr3.get(helper) % 10;//gets the remainder
                    arr3.set(helper, rem);//sets the element as the remainder
                    arr3.set(helper + 1, arr3.get(helper + 1) + carry);//carrys the one if need be
                    helper++;//adds one to helper to move to next element in the arraylisy
                }
            }
        }while(helper != arr3.size());//while loop until the whole arraylist is looked at

        if(arr3.size() > arr1.length)
        {
            arr3.set(arr3.size() - 1, arr3.get(arr3.size() - 1) - 1);//determines if carry was added to make the list a digit larger, if so it corrects the digits
        }

        System.out.println();
        System.out.println("-----------");//for presentation

        for(int i = arr3.size() -1; i >= 0; i--)
        {
            System.out.print(arr3.get(i) + " ");//prints out the sum
        }
        System.out.println();//presentation
    }

    static void testCase2()
    {
        int arr1[] = {9, 9, 9, 9, 9};
        int arr2[] = {9, 9, 9, 9, 9};
        ArrayList<Integer> arr3 = new ArrayList<Integer>();

        int carry = 1;
        int rem = 0;
        int helper = 0;

        System.out.println("Welcome to Test Case 2: ");//presentation
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");//prints out arr1
        }

        System.out.println();

        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");//prints out arr2
        }

        for(int i = arr1.length - 1; i >= 0; i--)
        {
            arr3.add(arr1[i] + arr2[i]);//creates an array list with the summation of arr1[i] + arr2[i], until the arrays are finished
        }

        do
        {
            if(arr3.get(helper) < 10)
            {
                helper++;//adds one to helper to move across the arraylist
            } else
            {
                if(arr3.get(arr3.size() - 1) > 9)
                {
                    arr3.add(carry);//if the last digit is larger than 10 it will add an element to carry
                }

                if(helper <= arr3.size()-2)
                {
                    rem = arr3.get(helper) % 10;//gets the remainder
                    arr3.set(helper, rem);//sets the element as the remainder
                    arr3.set(helper + 1, arr3.get(helper + 1) + carry);//carrys the one if need be
                    helper++;//adds one to helper to move to next element in the arraylisy
                }
            }
        }while(helper != arr3.size());//while loop until the whole arraylist is looked at

        if(arr3.size() > arr1.length)
        {
            arr3.set(arr3.size() - 1, arr3.get(arr3.size() - 1) - 1);//determines if carry was added to make the list a digit larger, if so it corrects the digits
        }

        System.out.println();
        System.out.println("-----------");//for presentation

        for(int i = arr3.size() -1; i >= 0; i--)
        {
            System.out.print(arr3.get(i) + " ");//prints out the sum
        }
        System.out.println();//presentation
    }

    static void testCase3()
    {
        int arr1[] = {1, 5, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 2};
        ArrayList<Integer> arr3 = new ArrayList<Integer>();

        int carry = 1;
        int rem = 0;
        int helper = 0;

        System.out.println("Welcome to Test Case 3: ");//presentation
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");//prints out arr1
        }

        System.out.println();

        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");//prints out arr2
        }

        for(int i = arr1.length - 1; i >= 0; i--)
        {
            arr3.add(arr1[i] + arr2[i]);//creates an array list with the summation of arr1[i] + arr2[i], until the arrays are finished
        }

        do
        {
            if(arr3.get(helper) < 10)
            {
                helper++;//adds one to helper to move across the arraylist
            } else
            {
                if(arr3.get(arr3.size() - 1) > 9)
                {
                    arr3.add(carry);//if the last digit is larger than 10 it will add an element to carry
                }

                if(helper <= arr3.size()-2)
                {
                    rem = arr3.get(helper) % 10;//gets the remainder
                    arr3.set(helper, rem);//sets the element as the remainder
                    arr3.set(helper + 1, arr3.get(helper + 1) + carry);//carrys the one if need be
                    helper++;//adds one to helper to move to next element in the arraylisy
                }
            }
        }while(helper != arr3.size());//while loop until the whole arraylist is looked at

        if(arr3.size() > arr1.length)
        {
            arr3.set(arr3.size() - 1, arr3.get(arr3.size() - 1) - 1);//determines if carry was added to make the list a digit larger, if so it corrects the digits
        }

        System.out.println();
        System.out.println("-----------");//for presentation

        for(int i = arr3.size() -1; i >= 0; i--)
        {
            System.out.print(arr3.get(i) + " ");//prints out the sum
        }
        System.out.println();//presentation
    }
}