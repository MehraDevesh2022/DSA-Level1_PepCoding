// 143. Reorder List
// Medium

// 5462

// 202

// Add to List

// Share
// You are given the head of a singly linked-list. The list can be represented as:

// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:

// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

// Example 1:


// Input: head = [1,2,3,4]
// Output: [1,4,2,3]
// Example 2:


// Input: head = [1,2,3,4,5]
// Output: [1,5,2,4,3]
 

// Constraints:

// The number of nodes in the list is in the range [1, 5 * 104].
// 1 <= Node.val <= 1000
 
 // There is code snippet given by leet code and as well as list given by leet code
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
    // first step = find mid and devide list in two list
    public ListNode middleNode(ListNode head) {
       if(head==null)
           return null;
       ListNode slow = head; // jump one step lower than fast
       ListNode fast =head;
       while(fast !=null && fast.next !=null) // even or odd number dipends
       {
           slow =slow.next;
           fast =fast.next.next;
       }
       return slow;
       
   }
      // second step reverse the second list
    public ListNode reverseList(ListNode head) {
       if(head == null)
       {   return null;
         }
       else{
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
   
   // Final step reorder list using two shorted list
   
   public void reorderList(ListNode head) {
       ListNode mid = middleNode(head); // call mid function and find mid
       ListNode NewHead = mid.next;
       // after mid devide list in two
       mid.next = null;
       
       ListNode head2 = reverseList(NewHead);// call resverse and reverse list
      
       //  ponting to first head using refrence varibale
       //  ponting to first head using refrence varibale
       ListNode one = head;
       ListNode two = head2;
       while(one !=null && two!=null){
               ListNode c1 =one.next; // using refrence variable for addresing next node address
               ListNode c2 = two.next;  // using refrence variable for addresing next node address
                
                one.next=two; // making link with second list
                two.next =c1; // connecting link with first list
               
              one =c1;  // moving node till null time
              two =c2;  // moving node till null time
       }
       
   }
}