// adds a star after each element of a string array

public class addStar
{
    public static void main(String [] args)
    {
        String [] a = {"once", "two", "three", "four"};

        String [] a1 = addStar(a);

        for(String val : a1)
        {
            System.out.print(val+" ");
        }
    }

    public static String[] addStar(String [] b)
    {
        String [] b1 = new String[b.length * 2];

        for(int i = 0; i < b.length; ++i)
        {
            b1[2 * i] = b[i];
            b1[(2 * i) + 1] = "*";
        }
        return b1;
    }
}
