// Prints a box of stars 
// number of stars is n
public class starBox
{
    public static void main(String [] args)
    {
        starBox(5);
        starBox(10);
    }

    public static void starBox(int n)
    {
        for (int i = 0; i < n; ++i)
        {
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = 0; i < (n-2); ++i)
        {
            System.out.print("*");
            for (int j = 0; j < (n-2); ++j)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        
        for (int i = 0; i < n; ++i)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
