import java.util.*;
public class Main{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
     int row1 = scn.nextInt();
     int clm1 = scn.nextInt();
      int a[][] = new int[row1][clm1];
      input(a);
      int row2 = scn.nextInt();
      int clm2 = scn.nextInt();
      int b[][] = new int[row2][clm2];
      input(b);
      int C[][] = multiply(a ,b);
      display(C);
    }
    public static void input(int a[][]){
              for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    a[i][j] = scn.nextInt();
                }
              }
    }

    public static void display(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
               System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] multiply(int a[][] , int b[][]){
            int row1 = a.length;
            int clm1 = a[0].length;
            int  clm2 = b[0].length;
            int sum =0;
            int C[][] = new int[row1][clm1];
            for(int i=0; i<row1; i++){
                for(int j=0; j<clm1; j++){
                    for(int k=0; k<clm1; k++){
                        sum += a[i][k]*b[k][j];
                    }
                    C[i][j] = sum;
                }
            } 
            return C;
    }
}


