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
class 2-Solution {
    // mid
    public ListNode midNode(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
   // reverse  : 
    public ListNode reverse(ListNode node) {
        ListNode prv = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode fwd = curr.next;
            curr.next = prv;
            prv = curr;
            curr = fwd;
        }
        return prv;
    }

    public void reorderList(ListNode head) {
        // edge case :
        if (head == null || head.next == null) {
            return;
        }

        // step1 : find mid and break list in two part.
        ListNode mid = midNode(head);
        ListNode newHead = mid.next;
        mid.next = null;

        // step 2 reverse the second list :
        newHead = reverse(newHead);

        // now reorderList using two list:
        ListNode c1 = head;
        ListNode c2 = newHead;
        ListNode curr = head;
        int count = 0;
        while (c1 != null && c2 != null) {
            if (count % 2 == 0) {
                c1 = curr.next;
                curr.next = c2;
                curr = c2;
            } else {
                c2 = curr.next;
                curr.next = c1;
                curr = c1;
            }
            count++;
        }
    }

}