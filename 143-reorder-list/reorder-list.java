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
        // Find the middle
        ListNode s = head;
        ListNode f = s.next;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        // Break the Linked List
        ListNode second = reverse(s.next);
        s.next = null;
        ListNode first = head;

        while (second != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;
            first.next = second;
            second.next = t1;
            first = t1;
            second = t2;
        }
    }

    public ListNode reverse(ListNode t) {
        ListNode curr = t;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}