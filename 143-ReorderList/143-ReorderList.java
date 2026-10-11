// Last updated: 10/11/2026, 10:31:25 PM
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
                ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode unreverseSecond = slow.next;
        slow.next = null;
        ListNode second = null;

        while (unreverseSecond != null) {
            ListNode next = unreverseSecond.next;
            unreverseSecond.next = second;
            second = unreverseSecond;
            unreverseSecond = next;
        }

        while (second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;
            first.next = second;
            second.next = firstNext;
            first = firstNext;
            second = secondNext;
        }

    }
}