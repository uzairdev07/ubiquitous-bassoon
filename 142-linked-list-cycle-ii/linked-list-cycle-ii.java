/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode sl = head;
        ListNode fs = head;

        while (fs != null && fs.next != null) {
            sl = sl.next;
            fs = fs.next.next;
            if (sl == fs) {
                fs = head;
                while (sl != fs) {
                    sl = sl.next;
                    fs = fs.next;
                }
                return sl;
            }            
        }

        return null;

    }
}