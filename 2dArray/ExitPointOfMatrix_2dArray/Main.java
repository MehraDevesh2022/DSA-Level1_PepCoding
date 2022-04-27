package ExitPointOfMatrix_2dArray;

import java.util.Scanner;

// Exit Point Of A Matrix
// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// e1, e2, .. n * m elements belongs to the set (0, 1)

// Format
// Input
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements

// Output
// row
// col (of the point of exit)

// Example
// Sample Input

// 4
// 4
// 0
// 0
// 1
// 0
// 1
// 0
// 0
// 0
// 0
// 0
// 0
// 0
// 1
// 0
// 1
// 0

// Sample Output
// 1
// 3
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
          int n = scn.nextInt();
          int m = scn.nextInt();
          
          int[][] a = new int[n][m];
          input(a);
          exitPoint(a);
    }
    public static void input(int a[][])
    {
        int n = a.length;   //row
        int m= a[0].length; //coloum

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j]= scn.nextInt();
            }
        }
    }

  public static void exitPoint(int a[][])
  {
      int n = a.length;
      int m= a[0].length;
      int i=0;
      int j=0;
      int dir =0; // direction
      while(true)
      {
          dir = dir + a[i][j]; // travling till 1 not comes else exit from maze
          dir = dir% 4 ; // bcz all direction are 4 and we starting from 0 (East ) when last direction occures that mean we will start with again 0th direction
          if(dir ==0)
          {
                    //east direction
              j++; // in east direction coloum increased 
          }
       else if(dir ==1)
       {         // south direction
           i++; // row increased in south 
       }
       else if(dir ==2)
       {
                  // west
           j--; // coloum decrasing   
       }
       else{
                   // north when dir ==3
             i--; // row decreasing when north travel occures 
       }
       // exit loop when player exit maze
       if(i<0 || j<0 || i>=n || j>=m)
       {
           break; 
         }
      }
      // finding value of exit point
      if(i>=n)
      {
          i--;
      }
      else if( i<0)
      {
          i++;
      }
      else if(j<0)
      {
          j++;
      }
      else{
          j--;  // when j>=m
        }
      System.out.println(i);
      System.out.println(j);
  }

}