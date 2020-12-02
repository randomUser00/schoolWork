// Takes an int (n) as parameter and returns whether n has at least one digit whose value is even. 

import java.util.Scanner;
public class evenChecker
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        int n;

        System.out.println("Enter the number to check for even: ");
        n = inputDevice.nextInt();

        if(hasAnEvenDigit(n))
        {
            System.out.println(n + " has even digits.");
        }else
        {
            System.out.println(n + " does not have even digits.");
        }
    }

    public static boolean hasAnEvenDigit(int n)
    {
        if(n==0)
        {
            return true;
        }
        while(n>0)
        {
            int digit = n % 10;
            if(digit % 2 == 0)
            {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}
