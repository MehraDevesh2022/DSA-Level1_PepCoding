/*
 * 21. Merge Two Sorted Lists
 * Easy
 * 
 * 14827
 * 
 * 1304
 * 
 * Add to List
 * 
 * Share
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists in a one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 * 
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 * 
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 * Accepted
 * 2,604,185
 * Submissions
 * 4,231,493
 */

 /**
 * Definition for singly-linked list.
  public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // edge case : when both are null or one of them is null
        if (list1 == null || list2 == null) {
            return (list1 == null) ? list2 : list1;
        }

        ListNode head = new ListNode(-1);
        ListNode prv = head;

        ListNode first = list1;
        ListNode second = list2;

        while (first != null && second != null) {
            if (first.val < second.val) {
                prv.next = first;
                prv = first;
                first = first.next;
            } else {
                prv.next = second;
                prv = second;
                second = second.next;
            }

        }
        // edge case : when one of them is bigger in size
        if (first != null) {
            prv.next = first;
        }
        if (second != null) {
            prv.next = second;
        }
        return head.next;

    }
}