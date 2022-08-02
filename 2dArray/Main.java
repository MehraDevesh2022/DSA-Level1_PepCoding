import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
            arr[i][j] =scn.nextInt();
        }

        for(int j=0; j<n; j++ ){
            int k=j; 
            for(int i=0; k<n; i++){
                System.out.println(arr[i][k]);
                k++;
            }
        }

    }
}