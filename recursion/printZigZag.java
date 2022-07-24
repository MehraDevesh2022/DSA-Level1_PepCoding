import java.util.*;
public class printZigZag{
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printZigZag(n);
    }

    public static void printZigZag(int n){
     if(n==0)
     {
         return;
     }   
     // first main value print itself
     System.out.print(n+" ");
     // then some work happend
     printZigZag(n-1);
     // here main value happen print again
     System.out.print(n+" ");
     // then some work will happen
     printZigZag(n-1);
     // end last main value happen again
     System.out.print(n+" ");
    }


}
