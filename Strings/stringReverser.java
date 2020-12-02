public class stringReverser
{
    public static void main(String [] args)
    {
        System.out.println(reverse("string"));
    }

    public static String reverse(String str)
    {
        String str2 = new String();
        for (int i = str.length() - 1; i > -1; --i)
        {
            str2 += str.charAt(i);
        }
        return str2;
    }
}
