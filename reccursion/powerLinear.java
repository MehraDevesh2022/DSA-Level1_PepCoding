package reccursion1st;
import java.util.*;
public class powerLinear {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
       int x=scn.nextInt();
        int result = powerLinear(n,x);
         System.out.println(result);

    }
    public static int powerLinear(int x,int n) {
        if(n==0)
        {
            return 1;

        }
        int result = x* powerLinear(x,n-1);
        return result;
    }
}
