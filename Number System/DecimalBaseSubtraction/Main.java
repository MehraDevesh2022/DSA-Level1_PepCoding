/* 
 * Decimal base to decimal subtraction
 * 1<=m <=n <= 10^9
 * input => n =11111
 *          m = 2222
 * output => 8889
 */           




package DecimalBaseSubtraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int ans = DecimalBaseSubtraction(n,m);
        System.out.println(ans);
    }
    public static int  DecimalBaseSubtraction(int n, int m) {
        int ans =0;
        int pow =1;
        int borrow =0;
        while(n!=0 || m!=0){
            int rem  = ((n!=0)?n%10:0) - ((m!=0)?m%10:0) + borrow;
            if(rem<0){
                rem +=10;
                borrow =-1;
            }
            else{
                borrow =0;
            }
            ans = ans+ rem*pow;
            pow= pow*10;
            n /=10;
            m /=10;


        }
        return  ans;
    }
}
