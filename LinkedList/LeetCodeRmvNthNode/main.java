// 19. Remove Nth Node From End of List
// Medium

// 9156

// 435

// Add to List

// Share
// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode slow= head;
       ListNode fast= head;
      // when single node that mean single element will remove so remain list is null so retrun null
       if( head==null || head.next ==null )
       {
           return null;
       } 
       // in this qus elemnt will removed from last to n index so we need to gap for finding that elements address between slow and fast pointer
       for(int i=0 ; i<n ; i++)
       {
           fast = fast.next;
       }
       // Check when s size == 2 and n==2 that case fast will travel up to null time and we need to remove head and retrun next element
       if(fast==null)
       {
           return head.next;
       }
       else{
           while(fast.next!=null)
           {
               slow = slow.next;
               fast= fast.next; // slow and fast pointer have gap so when fast arived at fast.next index then slow arived at n nodes privious node .
           }
        slow =slow.next.next; // that mean now slow lost the address of nth element and nth element is removed
       }
       return head;
    }

}