// Takes an int (n) as parameter and prints n stars (*) using for loop.

import java.util.Scanner;
public class starType1
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter number of stars to print: ");
        Scanner inputDevice = new Scanner(System.in);
        n = inputDevice.nextInt();
        printStars(n);
    }

    public static void printStars(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.print("*");
            System.out.println();
        }
    }
}


