
/*
 * Seating Arrangement
 * Easy
 * 
 * There are “n” students sitting in a row(0-based indexing) in an order of
 * their allotted ID’s in an increasing order.
 * The teacher wants to know the seat number of a specific student if he is
 * sitting in that row. If the student is not present in that row then he noted
 * the right position(seat number) of the student.
 * 
 * Return the seat number of the student if he’s present in a row else return
 * it’s correct position if he will be in the row.
 * 
 * Example:
 * Input: [1,3,7,9] , target student = 3
 * Output: 1
 * Input: [1,3,7,9] , target student = 5
 * Output: 2
 * Input: [1,3,7,9] , target student = 10
 * Output: 4
 * 
 * Constraints
 * 1) 1 <= nums.length <= 10^4
 * 2) -10^4 <= nums[i] <= 10^4
 * 3) nums contains distinct values sorted in ascending order.
 * 4) -10^4 <= target <= 10^4
 * 
 * Format
 * Input
 * Input and Output is managed for you.
 * 
 * Output
 * Input and Output is managed for you.
 * 
 * Example
 * Sample Input
 * 
 * 4
 * 1 3 5 6
 * 5
 * 
 * Sample Output
 * 2
 */
import java.util.*;

public class Main {

    public static int searchInsert(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            }

        }
        // edge case when student not available in row and less then max value of row .
        if (target < nums[nums.length - 1]) {
            return i;
            // when target value not available and also greatest value as compair to given
            // value from array.
        } else {
            return nums.length;
        }

    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        System.out.println(searchInsert(arr, target));
    }
}