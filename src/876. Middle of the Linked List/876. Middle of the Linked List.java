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
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         int n = 0;
//         ListNode cur = head;
//         while (cur != null) {
//             cur = cur.next;
//             ++n;
//         }
//         n = (n % 2 != 0 ? n/2 : (n + 1)/2);
//         while (n-- > 0) {
//             head = head.next;
//         }
//         return head;
//     }
// }

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        // fast 的速度是 slow 的兩倍
        // slow 的速度自然是 fast 的 1/2 倍
        while (fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
        }
        return slow;
    }
}