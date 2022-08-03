package SearchShortedArray_2dArray

import java.util.Scanner;



public class Main {
    static Scanner  scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n= scn.nextInt();
        int arr[][] =  new int[n][n];
         input(arr);
        int x = scn.nextInt();
        SearchInMatrix(arr ,x);
    }
    public static void input(int arr[][]){
        for(int i=0;  i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                  arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void SearchInMatrix(int arr[][] , int x){
        int i= arr.length-1;
        int j=0;
        while(true){
            int me =arr[i][j];
            if(me == x){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(me > x){
                i--;
            }
            else {
                j++;
            }
            if(i<0 || j>=arr.length){
                System.out.println("Not Found");
                return;
            }
        }
    }
}
