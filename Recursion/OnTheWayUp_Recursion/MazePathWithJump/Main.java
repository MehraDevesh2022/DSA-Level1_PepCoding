/*
 * Print Maze Paths With Jumps
 * Easy Prev Next
 * 1. You are given a number n and a number m representing number of rows and
 * columns in a maze.
 * 2. You are standing in the top-left corner and have to reach the bottom-right
 * corner.
 * 3. In a single move you are allowed to jump 1 or more steps horizontally (as
 * h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more
 * steps diagonally (as d1, d2, ..).
 * 4. Complete the body of printMazePath function - without changing signature -
 * to print the list of all paths that can be used to move from top-left to
 * bottom-right.
 * Use sample input and output to take idea about output.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A number n
 * A number m
 * Output Format
 * Print paths (one path in each line) in order hinted by Sample output
 * Question Video
 * 
 * 
 * COMMENTConstraints
 * 0 <= n <= 5
 * 0 <= m <= 5
 * Sample Input
 * 3
 * 3
 * Sample Output
 * h1h1v1v1
 * h1h1v2
 * h1v1h1v1
 * h1v1v1h1
 * h1v1d1
 * h1v2h1
 * h1d1v1
 */

 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n, m, "");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

          if(sr==dr-1 && sc == dc-1 ){
                   System.out.println(psf);
                   return;
           }
   // for  horizental move h1 , h2....
     for(int jump = 1; sc + jump< dc; jump++){
        printMazePaths(sr, sc+jump, dr, dc, psf + "h" +jump);
     }

     // for  vertical move v1 ,v2 ...
     for(int jump = 1; sr + jump< dr; jump++){
        printMazePaths(sr +jump, sc, dr, dc, psf + "v" +jump);
     }

     // for  diagonal move d1 , d2 ...
     for(int jump = 1; sc + jump< dc && sr+jump<dr; jump++){
        printMazePaths(sr+jump, sc+jump, dr, dc, psf + "d" +jump);
     }


    }

}