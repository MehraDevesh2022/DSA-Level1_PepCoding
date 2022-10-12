// Ever'body's askin' that. 'What we comin' to?' Seems to me we don't never come to nothin'. Always on the way.
//                                              ~John Steinbeck


// Maximum Sum Non Adjacent Elements
// Easy  Prev   Next
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers, representing n elements.
// 3. You are required to find the maximum sum of a subsequence with no adjacent elements.
// Input Format
// A number n
// n1
// n2
// .. n number of elements
// Output Format
// A number representing the maximum sum of a subsequence with no adjacent elements.
// Question Video

//   COMMENTConstraints
// 1 <= n <= 1000
// -1000 <= n1, n2, .. n elements <= 1000
// Sample Input
// 6
// 5
// 10
// 10
// 100
// 5
// 6
// Sample Output
// 116



import java.util.Scanner;

public class  main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int oldInclude = arr[0];
        int oldExclude = 0;
        for (int i = 1; i < arr.length; i++) {
            int newInclude = arr[i] + oldExclude;
            int newExclude = Math.max(oldInclude, oldExclude);

            oldInclude = newInclude;
            oldExclude = newExclude;
        }
        System.out.println(Math.max(oldInclude, oldExclude));
    }

}
