/*
 * I am not afraid of storms, for I am learning how to sail my ship.
                                ~ Louisa May Alcott
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
              Scanner scn =new Scanner(System.in);
              int n = scn.nextInt();
            
              int arr[][] = new int[n][3];
              for (int i = 0; i < n; i++) {
                  for (int j = 0; j < arr[0].length; j++) {
                      arr[i][j] = scn.nextInt();
                  }
              }

              int oldRed = arr[0][0] ;
              int oldBlue = arr[0][1];
              int oldGreen = arr[0][2];

              for(int i=1; i<arr.length; i++){
                int newRed = arr[i][0] + Math.min(oldGreen, oldBlue);
                int newBlue = arr[i][1] + Math.min(oldRed, oldGreen);
                int newGreen = arr[i][2] + Math.min(oldRed , oldBlue);

                oldRed = newRed;
                oldBlue = newBlue;
                oldGreen = newGreen; 
              }

              System.out.println(Math.min(oldRed , Math.min(oldGreen, oldBlue)));
    }
}