import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n[][] = new int[3][];
        n[0] =new int[3];
        n[1] =new int[2]; 
        n[2] =new int[4]; 
       
        for(int i=0; i<n.length; i++ ){
            for(int j=0; j<n[i].length; j++){
                n[i][j] = scn.nextInt();
            }
        }


        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        
        }
    }
   
}

