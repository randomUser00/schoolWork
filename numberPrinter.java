// print all the numbers from 1 upto the entered number

import java.util.Scanner;
public class agePrinter
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = input.nextInt();

        printNumber(num1);
    }

    public static void printNumber(int n)
    {
        int i = 1;
        while (i < n)
        {
            System.out.print(i + " ");
            ++i;
        }
    }
}
