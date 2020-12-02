public class perfectNum {
   public static void main (String args[]) {
        // Write your code here
        int n = 2;
        while (n < 1001){
            perfect(n);
            n++;
        }
    }

    public static void perfect(int n) {
        // Write your code here
        int sum = 0;
        int j = 1;
        while (j < n){
            if (n % j == 0){
                sum = sum + j;
            }
            j++;
        }
        if (n == sum){
            System.out.println(n);
        }

    }
}
