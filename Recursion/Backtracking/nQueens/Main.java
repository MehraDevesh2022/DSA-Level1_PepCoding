/*
 * N Queens
 * Easy Prev Next
 * 1. You are given a number n, the size of a chess board.
 * 2. You are required to place n number of queens in the n * n cells of board
 * such that no queen can kill another.
 * Note - Queens kill at distance in all 8 directions
 * 3. Complete the body of printNQueens function - without changing signature -
 * to calculate and print all safe configurations of n-queens. Use sample input
 * and output to get more idea.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A number n
 * Output Format
 * Safe configurations of queens as suggested in sample output
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 10
 * Sample Input
 * 4
 * Sample Output
 * 0-1, 1-3, 2-0, 3-2, .
 * 0-2, 1-0, 2-3, 3-1, .
 */

 import java.io.*;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws Exception {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int [][] chess = new int[n][n]; // by default is zero in every idx
  
   printNQueens(chess, "" , 0);
   
    }
    public static boolean isQueenSafe(int chess[][] , int row , int clm){

        // checking three starting  termination case because queen has threat with staring queens because we are arrangeing queen top - bottom 
        // 1 : top left -diagonlly 
        for(int i = row-1, j = clm-1; i>=0 && j>=0; i--,j--){
            if(chess[i][j] ==1){ 
             return false; 
            }
        }
      // 2:cheking streat top from curr position
      for (int i = row -1, j = clm; i >= 0 ; i--) {
          if (chess[i][j] == 1) {
              return false; 
          }
      }
      // 3 : top right-diagonlly
      for (int i = row - 1, j = clm + 1; i >= 0 && j< chess.length; i--, j++) {
          if (chess[i][j] == 1) { 
              return false; 
          }
      }
      return true; // if all those path are safe

    }
    public static void printNQueens(int[][] chess, String asf, int row) {
     if(row == chess.length){
      System.out.println(asf +".");
     }
     for(int clm=0; clm<chess.length; clm++){
          if(isQueenSafe(chess , row , clm)){
            chess[row][clm] =1; // mark the queen at that position
            printNQueens(chess, asf + row +"-" + clm +", ", row+1);
            chess[row][clm] =0; // unmarking the queen from that position
          }

     }

    }
}