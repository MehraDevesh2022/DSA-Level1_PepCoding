// 142. Linked List Cycle II
// Medium

// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

// Do not modify the linked list.

 

// Example 1:

// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.

// Example 2:

// Input: head = [1,2], pos = 0
// Output: tail connects to node index 0
// Explanation: There is a cycle in the linked list, where tail connects to the first node.

// Example 3:

// Input: head = [1], pos = -1
// Output: no cycle
// Explanation: There is no cycle in the linked list.

 

// Constraints:

//     The number of the nodes in the list is in the range [0, 104].
//     -105 <= Node.val <= 105
//     pos is -1 or a valid index in the linked-list.

 

// Follow up: Can you solve it using O(1) (i.e. constant) memory?



 // Definition for singly-linked list.
 class ListNode {
     int val;
      ListNode next;
    ListNode(int x) {
         val = x;
         next = null;
     }
 }
 

 


public class Solution {
    // check first is list circuler or not if circuler then return node where pointer meets
       public ListNode hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // edge case . here single node also not a circule list given in question
        if(head ==null || head.next == null){
            return null;   
        }
        // if list is not circuler that mean it will counter null value
        else {
       while(fast !=null && fast.next !=null)
       {
           slow = slow.next;
           fast = fast.next.next;
           // check if slow meet fast again after head that mean list is circuler
           if(slow== fast){
             return slow ; 
           }
              }
        }
       // when fast ==null or fast.next == null that mean list is nor circulate so return false 
     return null ;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode curr =head;
        ListNode temp = hasCycle(head); // check for ciruculer node where pointer meets
        if(temp==null)
        {
              return null; // when node is single or not available
        }
        else{
            // find the node where list start cirucler
            while(temp != curr){
                curr=curr.next;
                temp=temp.next;
            }
        }
      return curr;  // retrun circuler point node
    }
}