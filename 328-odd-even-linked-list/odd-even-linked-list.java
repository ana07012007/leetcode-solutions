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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null || head.next.next == null)return head;

        ListNode curr = head;
        ListNode odd = head.next.next;
        ListNode even = head.next;
        while(even != null && odd != null){
            even.next = odd.next;
            odd.next = curr.next;
            curr.next = odd;
            even = even.next;
            if(even != null)odd = even.next;
            curr = curr.next;
        }

        return head;
    }
}