/*
 * The most damaging phrase in the language is.. it's always been done this way
                                 ~ Grace Hopper
 */

/*                           
                          
 * Coin Change Combination
Easy  Prev   Next
1. You are given a number n, representing the count of coins.
2. You are given n numbers, representing the denominations of n coins.
3. You are given a number "amt".
4. You are required to calculate and print the number of combinations of the n coins using which the 
     amount "amt" can be paid.

Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be 
                  used for many installments in payment of "amt"
Note2 -> You are required to find the count of combinations and not permutations i.e.
                  2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same 
                  combination. You should treat them as 1 and not 3.
Input Format
A number n
n1
n2
.. n number of elements
A number amt
Output Format
A number representing the count of combinations of coins which can be used to pay the amount "amt"
Question Video

  COMMENTConstraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 20
0 <= amt <= 50
Sample Input
4
2
3
5
6
7
Sample Output
2
 */
// approch =>
/*
 * in combination only no repataion allowd 
 * eg : coins(2,3,5) and target  7 => result will be :  2,2,3 || 2 , 5 
 *  it will not work like => 223 ,232, 322, 25 , 52 this is permuation and here repation is occures
 * for combination we are using coin first for every targert amount an looking for payment possible or not
 * for target 2 => 2-2=0 and way to pay zero is 1 do nothing
 *  after 2 coin every target 0-7 we use 3 then 5 it will make sure only one way to possible for payement 
 */


 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int arr[] = new int[n];
     for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
     }
     int tar = scn.nextInt();
     int dp[] = new int[tar+1];
    int combination =  coinCombination(arr , dp,tar);
    System.out.println(combination);
    }

    public static int coinCombination(int[] arr, int[] dp, int tar) {
        // zero coin will come every time with every combination 
        dp[0] = 1;
       for(int coin=0; coin<arr.length; coin++){
        for(int currTar=arr[coin]; currTar<dp.length; currTar++){ //curTar = arr[coin] bcz if taregt 2 and coin 3 then teher is no way to payment 2 with three rs so we checking coin from near by target
            if(coin - arr[currTar] >=0){
           
                    dp[currTar] += dp[currTar-arr[coin]];
                
            }
        }
       }
        return dp[tar]; // when finally taregt archived for given test case in idx 7
    }
}
 