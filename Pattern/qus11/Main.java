import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int num =0;
         int lon =1; //line of numbers
         for(int row=1; row<=n; row++)
         {   // print number on console
             for(int colum =1; colum<=lon; colum++)
             {
                 num++;
                 System.out.print(num + "\t");
             }
             //update
             lon++;
             System.out.println();
         }
         
     }
}
