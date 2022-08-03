  import java.util.Scanner;

  public class Main{
    static Scanner scn = new Scanner(System.in);
    public static void input(int arr[][]) {
      for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++)
            arr[i][j] =scn.nextInt();
        }
   }
   public static void SearchIntoMatrix(int arr[][], int x){
    int j= arr.length-1;
    int i =0;

    while(true){
      int me = arr[i][j];
      if(me == x){
        System.out.println(i);
        System.out.println(j);
        return;
      }
      else if(me > x){
        j--;
      }
      else if(me < x){
         i++;
      }
      if(i>=arr.length || j<0){
        System.out.println("Not Found");
        return;
      }
 }
}
 
 
    public static void main(String[] args) {
       
        int n = scn.nextInt();
        // int m = scn.nextInt();
        int arr[][] = new int[n][n];
        input(arr);
        int x = scn.nextInt();
       SearchIntoMatrix(arr,x);

    }
}