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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Check if there are at least k nodes left in the list
        ListNode current = head;
        for (int i = 0; i < k; i++) {
            if (current == null) return head; // Not enough nodes to reverse
            current = current.next;
        }

        // Reverse k nodes
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < k; i++) {
            ListNode nextTemp = curr.next; // Store next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev to current
            curr = nextTemp; // Move to next node
        }

        // Recursively call for the next group
        if (curr != null) {
            head.next = reverseKGroup(curr, k);
        }

        // prev is now the head of the reversed group
        return prev;
    }
}
