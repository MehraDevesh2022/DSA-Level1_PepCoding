import java.util.Scanner;

public class tabulation {

/*  Method 1st => we are using it for log time use
 * steps of :febTabulation as compare to memoiztaion
 * change the state (n) to capital (N) in param
 * Memoitzion line remove
 *  instead od return use continue
 * instead of fn call use => dp[n-1] && dp[n-2]
 */

     public static int febTabulation(int N , int dp[]){
          for(int n=0; n<dp.length; n++){
            if(n<=1){
                dp[n] = n;
                continue; // instead of return
            }
            // ovservation from recursive calls
            // f(n) = f(n-1) + f(n-2); formula of febonacci 
            int myAns1 = dp[n-1]; // fiboMemo(n-1, dp); removing memoiztaion line
            int myAns2 = dp[n-2];  // fiboMemo(n-2, dp);
            int finalAns = myAns1 + myAns2;
            dp[n] = finalAns;
            
          } 
           return dp[N]; // finally return Nth idx  value of N fibonacci  number
     }

     // method 2nd =>
     public static int tabulation2(int n){
         int dp[] = new  int[n+1];

         dp[0] = 0;
         dp[1] = 1;

         for(int i=2; i<dp.length; i++){
            dp[i] = dp[n-1] + dp[n-2]; // from : fn(n) = fn(n-1) + fn(n-2);
         }
         return dp[n];
     }
     public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // method first :
        int dp[] = new int[n+1]; 
        int ans = febTabulation(n ,dp);
        System.out.println(ans);
    }
}
