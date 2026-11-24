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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        int len = length(head);
        k %= len;
        if(k == 0 )return head;
        ListNode newhead = reverse(head);

        ListNode temp = newhead;
        ListNode prev = temp;
        
        for(int i = 0 ; i < k ; i++){
            prev = temp;
            temp = temp.next;
        }
        ListNode oldhead = newhead;

        prev.next = null;
        head = reverse(newhead);
        oldhead.next = reverse(temp);

        return head;

    }

    public ListNode reverse(ListNode head){
        if(head.next == null)return head;

        ListNode newhead = reverse(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newhead;
    }

    public int length(ListNode head){
        int ans = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            ans++;
        }

        return ans;
    }
}