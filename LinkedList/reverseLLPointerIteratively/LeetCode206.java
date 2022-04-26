package reverseLLPointerIteratively;

// 206. Reverse Linked List
// Easy

// 10798

// 184

// Add to List

// Share
// Given the head of a singly linked list, reverse the list, and return the reversed list.

 

// Example 1:


// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// Example 2:


// Input: head = [1,2]
// Output: [2,1]
// Example 3:

// Input: head = []
// Output: []
 

// Constraints:

// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000
 




 
// Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
  // this is leetcode 206 solution code linklist is given by leetcode
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prv =null;
        ListNode cur =head;
        while(cur!=null)
        {     // link reverse
            ListNode fwd =cur.next;
            cur.next = prv;
            // update position
            prv=cur;
            cur=fwd;
          }
        return prv;
    }  
}