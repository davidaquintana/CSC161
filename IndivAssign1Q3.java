
/*
    David Quintana
    Individual Assignment 1, Question 3

    Ths program has uses arrays and simple algebra to determine your final grade. The first array
    stores the scores you got in each category, the second detrmines the weight of each category and
    the final array is the weighted grade, you add all elements of the weighted grade array to determine the 
    final grade
 */

import java.util.*;

class Student
{
    private double[] arrG;//array for the grades
    private double[] arrP;//array for the percentage int final grade
    private double[] arrF;//array for grade * percentage 


    public Student(double arrG[], double arrP[], double arrF[])
    {
        this.arrG = arrG;//initializes arrG
        this.arrP = arrP;//initializes arrP
        this.arrF = arrF;//initializes arrF
    }

    public void finalGrade()//calculates final gradde
    {
        for(int i = 0; i < arrF.length; i++)
        {
            arrF[i] = arrG[i] * (arrP[i]/100);//creates the points earned given grade and percentage
        }

        int finalGrade = 0;//initializes the finalGrade int
        for(int i = 0; i < 4; i++)
        {
            finalGrade += arrF[i];//adds all elements of arrF to get the final grade
        }
        System.out.println("Your Final Grade is: " + finalGrade + "%");//prints out the final grade
    }
}//student class

public class IndivAssign1Q3 
{
    public static void main(String[] args)
    {
        //presentation
        System.out.println("Welcome to the Grade Calculator");
        System.out.println("Enter 1, 2, or 3 for each test case.");


        Scanner in = new Scanner(System.in);//creates new Scanner class
        int input = in.nextInt();//stores input

        if(input == 1)//passing grade
        {
            double[] arrG = {90,90,89,75};//arrG
            double[] arrP = {40,40,10,10};//arrP
            double[] arrF = {0,0,0,0};//arrF
    
            Student test = new Student(arrG, arrP, arrF);
            test.finalGrade();//calls finalGrade in the student class

        }else if(input == 2)//failing grade
        {
            double[] arrG = {45,20,30,40};//arrG
            double[] arrP = {10,20,30,40};//arrP
            double[] arrF = {0,0,0,0};//arrF
    
            Student test = new Student(arrG, arrP, arrF);
            test.finalGrade();//calls finalGrade in the student class

        } else if(input == 3)//example give
        {
            double[] arrG = {40,50,60,80};//arrG
            double[] arrP = {10,10,45,35};//arrP
            double[] arrF = {0,0,0,0};//arrF
    
            Student test = new Student(arrG, arrP, arrF);
            test.finalGrade();//calls finalGrade in the student class

        } else 
        {
            System.out.println("Invalid Input");//edge case
        }
        in.close();//closes Scanner in
    }//main
}