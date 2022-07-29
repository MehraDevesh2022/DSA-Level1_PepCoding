import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int Fidx = firstIdx(a, d);
        int Lidx = SecondIdx(a, d);
        System.out.println(Fidx);
        System.out.println(Lidx);

    }

    public static int firstIdx(int arr[], int d) {
        int Fidx = -1;
        int i = 0;
        int j = arr.length - 1;
        int mid = 0;
        while (i<=j) {
            mid = i + j / 2;
            if (arr[mid] == d) {
                Fidx = mid;
                j = mid - 1;
            } else if (arr[mid] > d) {
                j = mid - 1;
            } else if (arr[mid] < d) {
                i = mid + 1;
            }
        }
        return Fidx;

    }

    public static int SecondIdx(int arr[], int d) {
        int Lidx = -1;
        int i = 0;
        int j = arr.length - 1;
        int mid = 0;
        while (i<=j) {
            mid = i + j/ 2;
            if (arr[mid] == d) {
                Lidx = mid;
                i = mid + 1;
            } else if (arr[mid] < d) {
                i = mid +1;
            }

            else if (arr[mid] > d) {
                j = mid - 1;
            }

        }
        return Lidx;
    }

}