public class arrayReverser
{
    public static void main(String [] args)
    {
        int [] a = {2,3,4,5};
        reverse(a);

        for (int i = 0; i < a.length; ++i)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void reverse(int [] b)
    {
        for (int i = 0; i < (b.length / 2); ++i)
        {
            int temp = b[i];
            b[i] = b[b.length-1-i];
            b[b.length-1-i] = temp;
        }
    }
}
