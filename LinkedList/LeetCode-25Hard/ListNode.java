// 25. Reverse Nodes in k-Group
// Hard

// 6556

// 476

// Add to List

// Share
// Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

// You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [2,1,4,3,5]
// Example 2:


// Input: head = [1,2,3,4,5], k = 3
// Output: [3,2,1,4,5]
 

// Constraints:

// The number of nodes in the list is n.
// 1 <= k <= n <= 5000
// 0 <= Node.val <= 1000
 

// Follow-up: Can you solve the problem in O(1) extra memory space?


 // Definition for singly-linked list.
  public class ListNode {
     int val;
     ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public static ListNode tempHead ;
    public static ListNode tempTail ;

    public static int size(ListNode head)
    {
        ListNode curr = head;
        int lenth =0;
        while(curr != null)
        {
            curr=curr.next;
            lenth ++;
        }
        return lenth;
    }
   
    public static void addFirst(ListNode node)
    {
        if(tempHead==null)
        {
            tempHead=node;
            tempTail=node;
        }
        else{
            node.next=tempHead;
            tempHead=node;
            
        }
    }


    public ListNode reverseKGroup(ListNode head, int k) {

      int lenth = size(head);
      ListNode oH =null; // original head
      ListNode oT = null; // original tail

     ListNode curr =head;

     while(lenth>=k)
     {
         for(int i =0; i<k; i++)
         {
             ListNode fwd = curr.next;
             curr.next= null;
             addFirst(curr);
             curr =fwd;
         }
         if(oH==null)
         {
             oH = tempHead;
             oT = tempTail;
             tempHead = null;
             tempTail = null;
         }
         else{
             oT.next= tempHead;
             oT=tempTail;
             tempHead=null;
             tempTail=null;
         }
         lenth=lenth-k;

     }
        oT.next=curr;
        return oH;
    }
}