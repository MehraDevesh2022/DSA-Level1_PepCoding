// 148. Sort List
// Medium

// 6819

// 225

// Add to List

// Share
// Given the head of a linked list, return the list after sorting it in ascending order.

// Example 1:

// Input: head = [4,2,1,3]
// Output: [1,2,3,4]
// Example 2:

// Input: head = [-1,5,3,4,0]
// Output: [-1,0,3,4,5]
// Example 3:

// Input: head = []
// Output: []

// Constraints:

// The number of nodes in the list is in the range [0, 5 * 104].
// -105 <= Node.val <= 105

class Solution {
    // add mid function where mid value left one
    public ListNode middleNode(ListNode head) {
        if(head==null)
            return null;
        ListNode slow = head; // jump one step lower than fast
        ListNode fast =head;
        while(fast.next !=null && fast.next.next !=null) // even or odd number dipends
        {
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
        
    }
  // add merge two shorted function  
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prv = new ListNode(-1);
        ListNode head = prv;
        if(list1 == null || list2 ==null)
        {
               return (list1 == null) ? list2 : list1;
        }
        
        while(list2 !=null && list1 !=null  )
        {
            if(list1.val <= list2.val)
            {
                prv.next =list1;
                prv= list1;
                list1 =list1.next;
             }
            else
            {
                prv.next=list2;
                prv = list2;
                list2 = list2.next;
            }
            
        }
        if(list1 !=null)
        {
            prv.next = list1;
        }
        
        if(list2 != null)
        {
            prv.next = list2;
        }
        return head.next;
    }
    
    // using mid function divide list till single node using recursion and add two list using merge two shorted function
    public ListNode sortList(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode midd =  middleNode(head);
        ListNode nh = midd.next;
        midd.next = null;
        
        head =sortList(head);
        nh  =sortList(nh);
        
        return mergeTwoLists(head ,nh);
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeSort(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode head = new ListNode(-1);
        ListNode prv = head;

        ListNode one = l1;
        ListNode two = l2;

        while (one != null && two != null) {
            if (one.val < two.val) {
                prv.next = one;
                prv = one;
                one = one.next;

            } else {

                prv.next = two;
                prv = two;
                two = two.next;
            }

        }
        if (one != null) {
            prv.next = one;
        }
        if (two != null) {
            prv.next = two;
        }
        return head.next;

    }

    public ListNode midNode(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        // edge case :

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = midNode(head);
        ListNode newHead = mid.next;
        mid.next = null;

        ListNode right = sortList(head);
        ListNode left = sortList(newHead);

        return mergeSort(right, left);

    }
}