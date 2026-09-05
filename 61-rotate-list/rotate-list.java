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
        if(head == null || head.next == null || k == 0)return head;
        int length = findlength(head);
       
        ListNode temp = head;
        ListNode prev = null;
        int cnt = 0;
        k = k % length;
        
        if(length == k || k == 0)return head;
        while(cnt++ < length - k){
            prev = temp;
            temp = temp.next;
        }
        ListNode newhead = temp;
        prev.next = null;
        while(temp != null && temp.next != null)temp = temp.next;

        temp.next = head;
        return newhead;
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
}