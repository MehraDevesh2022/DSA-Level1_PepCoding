import java.util.Scanner;

public class Main4 {
   static Scanner scn = new Scanner(System.in);

    public static void input(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();

            }
        }
    }  
   
    public static void transpose(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                swap1(arr , i , j);
            }
        }
    }   
    public static void swap1(int arr[][] , int i , int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
         arr[j][i] = temp;
    }
    public static void reverse(int arr[][]){
       
        int i=0;
        int n = arr.length;
        while(i<n){
        int j=0;
        int k= arr[0].length-1;
        while(j<=k){
            int temp = arr[i][j];
            arr[i][j] = arr[i][k];
            arr[i][k] = temp;
            j++;
            k--;
        }
         i++;
           
        }
    }
   
    
    public static void display(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   public static void main(String[] args) {
      int n = scn.nextInt();
      int arr[][] = new int[n][n];
      input(arr);
      transpose(arr);
      reverse(arr);
      display(arr);
   } 

}
