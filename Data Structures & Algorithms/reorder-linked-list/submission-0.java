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
    public void reorderList(ListNode head) {
        // find mid
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode first = head;
        
        ListNode curr = slow.next;
        ListNode prev = null;

        slow.next = null; // split it

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode second = prev;

        while(first != null && second != null) {
            ListNode n1 = first.next;
            ListNode n2 = second.next;

            first.next = second;
            second.next = n1;

            first = n1;
            second = n2;
        }
    }
}
