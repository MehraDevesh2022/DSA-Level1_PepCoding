import java.lang.reflect.Array;
import java.util.Arrays;

public class Main{
     public static void main(String[] args) {
           int arr[][] = {{1,3} ,{4,9} ,{3,6} ,{2,5} ,{18 ,11} ,{11 ,-1} ,{-1 ,33}};

           // this is 7*2 matrix
           // we need to sort it as 0 idx base.. 
           // matrix all 0th elm should be sort
             
           // for that lambda function requird =>
           Arrays.sort(arr , (a,b) ->{ // (int[] a , int[] b ) same as well (a,b)->
        return a[0]-b[0]; // this is same like comparitible function (this.val -other.val) where (a[0] ==this.val and b[0] is othe.val)  
           });


           for(int oneD[] : arr){
            System.out.println(oneD[0] +" "+ oneD[1]);
           }
           /* output is : all [0] idx elm are sorted into increasing order
            * -1 33
            * 1 3
            * 2 5
            * 3 6
            * 4 9
            * 11 -1
            * 18 11
            * 
            * 
            */



            // now if we need sorting in decreasing order then ==> other.val -this.val (b[0] -a[0]) 

            Arrays.sort(arr, (a, b) -> { // (int[] a , int[] b ) same as well (a,b)->
                return b[1] - a[1];  // 1st idx in deacreasing order
                     });

            for (int oneD[] : arr) {
                System.out.println(oneD[0] + " " + oneD[1]);
            }
         /*
          * -1 33
          * 18 11
          * 4 9
          * 3 6
          * 2 5
          * 1 3
          * 11 -1
          * 
          */

    }
}