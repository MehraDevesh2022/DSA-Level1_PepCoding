import java.util.Scanner;

public class powerLog {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int x=scn.nextInt();
        int result =powerLog(x,n);
        System.out.println(result);
    }
    public static int powerLog(int x, int n)
    {
        if(n==0)
        {
         return 1;
        }
        int ans =powerLog(x, n/2);
        if(n%2==0)
        {
            int result =ans*ans;
            return result;
        }
        else
        {
           int result =ans*ans*x;
           return result;
        }
    }
}
