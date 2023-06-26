/*
    David Quintana
    Individual Assignment 1, Question 1

    Ths program has predetermined arrays that are added to a third array and then sroted for lowest to largest
    The sorting process looks at the first element and compares it to the next, and repeats this process until the
    array is sorted
 */

import java.util.*;


public class IndivAssign1Q1
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Individual Assignment Question 1!");
        System.out.println("Please pick a test case to do: Test Case 1 is a random array containing a duplicate, Test Case 2 contains all duplicates and Test Case 3 contains negative numbers");
        System.out.println("Input 1, 2, 3 or 4 (All of the Test Cases)");
        Scanner in = new Scanner(System.in);//creates scanner class

        int input = in.nextInt();//stores user input
        
        if(input == 1)
        {
            testCase1();
        } else if(input == 2)
        {
            testCase2();
        } else if(input == 3)
        {
            testCase3();
        } else if(input == 4)
        {
            testCase1();
            testCase2();
            testCase3();
        } else
        {
            System.out.println("Invalid Input");//edge case
        }
        in.close();//closes scanner
    }

    static void testCase1()
    {
        int helper = 0;
        int arr1[] = {9, 8, 6, 7, 5};
        int arr2[] = {1, 3, 4, 2, 5};
        int sortedArr[] = new int[10];
        int temp;

        for(int i = 0; i < arr1.length; i++)
        {
            sortedArr[i]  = arr1[i];//adds all of arr1 into sortedArr
        }

        for(int i = arr2.length; i < sortedArr.length; i++)
        {
            sortedArr[i] = arr2[helper];//adds all of arr2 into sortedArr
            helper++;//allows arr2 to be added into sortedArr after arr1 has been
        }

        System.out.print("OG Array: ");//presentation
        for(int g = 0; g < sortedArr.length; g++)
        {
            System.out.print(sortedArr[g] + " ");//prints out the unsorted array
        }

        for(int first = 0; first <= sortedArr.length; first++)
        {
            for(int next = first+1; next <= (sortedArr.length -1); next++)
            {
                if(sortedArr[first] > sortedArr[next])//if the first element is larger than the second
                {
                    temp = sortedArr[first];//temp stores og first valie
                    sortedArr[first] = sortedArr[next];//the first value is now the second element
                    sortedArr[next] = temp;//the second value is the now the previous first value
                }
            }
        }

        System.out.println();
        System.out.print("Sorted Array: ");//presentation

        for(int i = 0; i < sortedArr.length; i++)
        {
            System.out.print(sortedArr[i] + " ");//prints out sorted array
        }
    }

    static void testCase2()
    {
        int helper = 0;
        int arr1[] = {0, 0, 0, 0, 0};
        int arr2[] = {0, 0, 0, 0, 0};
        int sortedArr[] = new int[10];
        int temp;

        for(int i = 0; i < arr1.length; i++)
        {
            sortedArr[i]  = arr1[i];//adds all of arr1 into sortedArr
        }

        for(int i = arr2.length; i < sortedArr.length; i++)
        {
            sortedArr[i] = arr2[helper];//adds all of arr2 into sortedArr
            helper++;//allows arr2 to be added into sortedArr after arr1 has been
        }

        System.out.print("OG Array: ");//presentation
        for(int g = 0; g < sortedArr.length; g++)
        {
            System.out.print(sortedArr[g] + " ");//prints out the unsorted array
        }

        for(int first = 0; first <= sortedArr.length; first++)
        {
            for(int next = first+1; next <= (sortedArr.length -1); next++)
            {
                if(sortedArr[first] > sortedArr[next])//if the first element is larger than the second
                {
                    temp = sortedArr[first];//temp stores og first valie
                    sortedArr[first] = sortedArr[next];//the first value is now the second element
                    sortedArr[next] = temp;//the second value is the now the previous first value
                }
            }
        }

        System.out.println();
        System.out.print("Sorted Array: ");//presentation

        for(int i = 0; i < sortedArr.length; i++)
        {
            System.out.print(sortedArr[i] + " ");//prints out sorted array
        }
    }

    static void testCase3()
    {
        int helper = 0;
        int arr1[] = {-9, 8, 6, 7, -5};
        int arr2[] = {1, 3, -4, 2, 5};
        int sortedArr[] = new int[10];
        int temp;

        for(int i = 0; i < arr1.length; i++)
        {
            sortedArr[i]  = arr1[i];//adds all of arr1 into sortedArr
        }

        for(int i = arr2.length; i < sortedArr.length; i++)
        {
            sortedArr[i] = arr2[helper];//adds all of arr2 into sortedArr
            helper++;//allows arr2 to be added into sortedArr after arr1 has been
        }

        System.out.print("OG Array: ");//presentation
        for(int g = 0; g < sortedArr.length; g++)
        {
            System.out.print(sortedArr[g] + " ");//prints out the unsorted array
        }

        for(int first = 0; first <= sortedArr.length; first++)
        {
            for(int next = first+1; next <= (sortedArr.length -1); next++)
            {
                if(sortedArr[first] > sortedArr[next])//if the first element is larger than the second
                {
                    temp = sortedArr[first];//temp stores og first valie
                    sortedArr[first] = sortedArr[next];//the first value is now the second element
                    sortedArr[next] = temp;//the second value is the now the previous first value
                }
            }
        }

        System.out.println();
        System.out.print("Sorted Array: ");//presentation

        for(int i = 0; i < sortedArr.length; i++)
        {
            System.out.print(sortedArr[i] + " ");//prints out sorted array
        }
    }
}
