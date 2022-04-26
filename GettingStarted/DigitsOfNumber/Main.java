import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
        int n= scn.nextInt();
        int temp=n;
        int d=0;
        int pow=1;
        while(temp >10) // bcz for bigger number pow liimit will exceed in int case 
        {
            temp=temp/10;
            pow =pow*10;
           
        }
      while(n!=0)
      {
          int ans = n/pow;
          System.err.println(ans);
           n = n%pow;
           pow=pow/10;
           

      }
     
    }
}
