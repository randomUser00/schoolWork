// Write a program that asks the user to input two integers a and b
// Then create an array that has all integer from a to b. Print out the array
// Pass the above array as a parameter to a method called average and return the average 
// print it out in the main method. 

import java.util.Scanner;
public class numRangeArray
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the two numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int biggerNum, smallerNum;

        if (num1 >= num2)
        {
            biggerNum = num1;
            smallerNum = num2;
        }else
        {
            biggerNum = num2;
            smallerNum = num1;
        }
        int distance = biggerNum - smallerNum;

        int numbers[] = new int[distance + 1];

        if (num1 == biggerNum)
        {
            for(int i = 0; i <= distance; i++)
            {
                numbers[i] = biggerNum;
                --biggerNum;
                System.out.print(numbers[i] + " ");
            }
        }else
        {
            for(int i = 0; i <= distance; i++)
            {
                numbers[i] = smallerNum;
                ++smallerNum;
                System.out.print(numbers[i] + " ");  
            }
        }
        System.out.println();
        System.out.println("The average value of the array is: "+ average(numbers));
    }

    public static double average(int [] arr)
    {
        double sum = 0.0;
        for (int i = 0; i < arr.length; ++i)
        {
            sum += arr[i];
        }

        double avg = sum / arr.length;
        return avg;
    }
}
