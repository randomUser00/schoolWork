/**
 * store 10 multiples of 5 and print it out. 
 * Use for loop to generate the multiples 
 * then print them out using a second for loop.
 */
public class numMultiplesArray
{
    public static void main(String [] args)
    {
        int [] a = new int[10];

        for (int i = 0; i < a.length; ++i)
        {
            a[i] = (i+1) * 5;
        }

        for (int i = 0; i < a.length; ++i)
        {
            System.out.print(a[i] + " ");
        }
    }
}
