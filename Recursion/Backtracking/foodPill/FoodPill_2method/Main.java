import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }
public static int dir [][] = {{-1,0} ,{0,-1}, {1,0} , {0,1}};
public static char dirs[] = {'t','l','d','r'};

public static void floodfill(int maze[][] , int i, int j, String str){

           if(i==maze.length-1 && j==maze.length-1){
             System.out.println(str);
             return;
           }

           maze[i][j] =1;
for(int d=0; d<dir.length; d++){
    int row = i + dir[d][0]; // from dir acsessing value -1 ,0 ,1,0  
    int clm = j + dir[d][1]; //from dir acsessing value 0 , -1, 0,1
  // calls are for t, l,d,r
     if(row>=0 && clm >=0 && row<maze.length && clm <maze[0].length && maze[row][clm] !=1){
           floodfill(maze, row, clm, str + dirs[d]); //  dirs[d] will add t,l,d,r into the ans String
           }
        //    maze[i][j] = 0;  // dry run requird
            
       }
       maze[i][j] = 0;
}

}
