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
        int length = findlength(head);
        if(head == null || head.next == null || k == 0)return head;
        k %= length;
        if(k == 0)return head;
        ListNode newhead = reverse(head);
        ListNode temp = newhead;
        while(temp != null && k-- > 1)temp = temp.next;
        ListNode nextNode = temp.next;
        temp.next = null;
        
        head = reverse(newhead);
        ListNode curr = reverse(nextNode);
        newhead.next = curr;
        
        return head;
    }

    public int findlength(ListNode head){
        ListNode temp = head;
        int ans = 0;
        while(temp != null){
            ans++;
            temp = temp.next;
        }

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