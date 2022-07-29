package CeileFloor;

public class Main {
    
}

import java.io.*;
import java.util.*;

public class Main {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int a[] = new int[n];
        input(a);
        int d = scn.nextInt();
        CeilFloor(a, d);
    }

    public static void input(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
    }

    public static void CeilFloor(int arr[], int d) {

        int mid = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            mid = (i + j) / 2;
            if (arr[mid] == d) {
                System.out.println(arr[mid]);
                return;
            } else if (arr[mid] > d) {
                j = mid - 1;
            } else if (arr[mid] < d) {
                i = mid + 1;

            }
        }

        System.out.println(arr[i]);
        System.out.println(arr[j]);

    }

}