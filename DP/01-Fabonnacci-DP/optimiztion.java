import java.util.Scanner;
// optimization all about optimize code after observation from tabulation and memoization
public class optimiztion {
    public static int optimizationFabo(int n){
      int a =0;
      int b=1;
      int c =1;
      for(int i=1; i<=n; i++){
        c= a+b;
        a=b;
        b=c;
      }
        return a;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = optimizationFabo(n);
        System.out.println(ans);
    }
}
