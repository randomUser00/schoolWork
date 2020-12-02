//    1
//   2
//  3
// 4
//5

// You can change the spaces to dots
public class DiagonalNum
{
    public static void main(String [] args)
    {
        for(int i = 1; i <=5; ++i)
        {
            for (int j = 1; j <= (5-i); ++j)
            {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
