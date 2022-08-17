/*
 * Facing the sun
 * EasyAccuracy: 49.76%Submissions: 18361Points: 2
 * Given an array H representing heights of buildings. You have to count the
 * buildings which will see the sunrise (Assume : Sun rise on the side of array
 * starting point).
 * 
 * 
 * Example 1:
 * 
 * Input:
 * N = 5
 * H[] = {7, 4, 8, 2, 9}
 * Output: 3
 * Explanation: As 7 is the first element, it
 * can see the sunrise. 4 can't see the
 * sunrise as 7 is hiding it. 8 can see.
 * 2 can't see the sunrise. 9 also can see
 * the sunrise.
 * Example 2:
 * 
 * Input:
 * N = 4
 * H[] = {2, 3, 4, 5}
 * Output: 4
 * Explanation: As 2 is the first element, it
 * can see the sunrise. 3 can see the
 * sunrise as 2 is not hiding it. Same for 4
 * and 5, they also can see the sunrise.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the
 * function countBuildings() which takes the array of integers h and n as
 * parameters and returns an integer denoting the answer.
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * Constraints:
 * 1 ≤ N ≤ 106
 * 1 ≤ Hi ≤ 108
 */

 import java.util.Scanner;

class Main {
    static Scanner scn = new Scanner(System.in);

    public static void input(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }
// because if first building greater than others that building hides all othres .. rg: 10 2 6 7 19 2 3 10 11 > here 10 hides 2 3 7 and 19 other more
    public static int countBuildings(int arr[], int n) {
        // code here
        int max = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int arr[] = new int[n];
        input(arr);
        int ans = countBuildings(arr, n);
        System.out.println(ans);

    }
}