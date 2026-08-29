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
        ListNode newhead = reverse(head);
        if(n == 1){
            ListNode ans = reverse(newhead.next);
            return ans;
        }
        int cnt = 1;
        ListNode temp = newhead;
        while(cnt < n - 1){
            temp = temp.next;
            cnt++;
        }
        temp.next = temp.next.next;

        ListNode ans = reverse(newhead);

        return ans;

    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)return head;

        ListNode newhead = reverse(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newhead;
    }
}