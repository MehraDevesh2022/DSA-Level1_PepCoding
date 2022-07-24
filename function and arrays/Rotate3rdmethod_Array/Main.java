package Rotate_Array.Rotate3rd_Array;
import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k) {
        int n = a.length;
        int arr[] = new int[n];
        int j = n - k;
        int i = 0;
        while (true) {
            if (j < n) {
                arr[i] = a[j];
                i++;
                j++;
            } else {
                break;
            }
        }
        j = 0;
        while (j < n - k) {
            arr[i] = a[j];
            j++;
            i++;

        }
        display(arr);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);

    }

}