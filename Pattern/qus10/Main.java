 import java.util.*;
public class Main{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int lsp = n/2; // lsp== left side space
        int msp = -1;  //msp= middle side space
        int star = 1;
        for(int row=1; row<=n; row++)
        {
            for(int lsc =1; lsc<=lsp; lsc++)
            {
                System.out.print("\t");
            }

            if(row !=1 && row!=n)
            {
                for(int cst =1; cst<=star; cst++)
                {  // cst == count of star
                    System.out.print("*\t");
                }
            }
            for(int msc =1; msc<=msp; msc++)
            {     // msc === middle space count
                System.out.print("\t");
            }
            for(int cst =1; cst<=star; cst++)
            {     
                System.out.print("*\t");
            }

            if(row<=n/2)
            {
                lsp--;
                msp=msp+2;
            }
            else{
                lsp++;
                msp=msp-2;
            }
            System.out.println();
        }
    }
}