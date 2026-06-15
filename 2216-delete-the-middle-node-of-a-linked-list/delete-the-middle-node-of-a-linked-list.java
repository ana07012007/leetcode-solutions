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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        int n = listlength(head);
        ListNode temp = head;
        int count = 0;

        while(count != n/2-1){
            temp = temp.next;
            count++;
        }
        
        if(temp.next.next != null)temp.next = temp.next.next;
        else temp.next = null;
        return head;

    }

    public int listlength(ListNode head){
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
}