import java.util.Scanner;

//  n fabonacci numser uing recursion

public class Main{

public static int printFabonacci(int n){
    if(n<=1){
      return n;
    }

    // call :
   int ans1 = printFabonacci(n-1);
    int ans2 = printFabonacci(n-2);
    int myAns = ans1 + ans2;
    
    return myAns;
}    
public static void main(String[]  args){
  Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
  int ans =  printFabonacci(n);
  System.out.println(ans);
    }
}