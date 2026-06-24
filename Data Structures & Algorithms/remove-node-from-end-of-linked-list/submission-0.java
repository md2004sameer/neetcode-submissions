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

        // get the len n 
        int len = 0;
        ListNode curr = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        

        while(curr != null){
            curr = curr.next;
            len++;
        }
        ListNode prev = dummy;

        for(int i =0 ; i < len-n;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;

        return dummy.next;

    }
}
