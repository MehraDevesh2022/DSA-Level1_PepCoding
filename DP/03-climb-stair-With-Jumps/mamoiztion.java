import java.util.Scanner;

public class mamoiztion {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here

        int n = scn.nextInt();
        int arr[] = new int[n];
        input(arr);
        int dp[] = new int[n+1];
        int ans = climbStairs(0, n, arr , dp);
        System.out.println(ans);
    }

    public static int climbStairs(int src, int dst, int arr[],int dp[]) {
        if (src == dst) {
           return dp[src]=1;
          }

         if(dp[src] !=0){
            return dp[src];
         }
 

        int count = 0;
        for (int jump = 1; jump <= arr[src]; jump++) {

            if (src + jump <= dst) {
                count += climbStairs(src + jump, dst, arr, dp);
            }
        
        }
        return dp[src] =count;
    }
}
