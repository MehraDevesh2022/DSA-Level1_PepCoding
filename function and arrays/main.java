import java.io.*;
import java.util.*;

public class Main {
  static Scanner scn = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int n1 = scn.nextInt();
    int a1[] = new int[n1];
    input(a1);
    int n2 = scn.nextInt();
    int a2[] = new int[n2];
    input(a2);
    SumofArray(a1, a2);

  }

  public static void input(int arr[]) {

    for (int i = 0; i < arr.length; i++)
      arr[i] = scn.nextInt();
  }

  public static void SumofArray(int a[], int b[]) {
    int sum = 0;
    int carry = 0;
    int i = a.length;
    int j = b.length;
    int k = i > j ? i : j;

    int c[] = new int[k];
    i--;
    j--;
    k--;
    while (k >= 0) {

      sum = (i >= 0 ? a[i] : 0) + (j >= 0 ? b[j] : 0) + carry;
      carry = sum / 10;
      sum = sum % 10;

      c[k] = sum;
      k--;
      j--;
      i--;

    }
    for (int p : c) {
      System.out.println(p);
    }
  }

}
