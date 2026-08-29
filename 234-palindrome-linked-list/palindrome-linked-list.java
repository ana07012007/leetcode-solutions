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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newhead = reverse(slow);
        
        slow = head;
        fast = newhead;
        while(fast != null){
            if(slow.val != fast.val)return false;
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newn = reverse(newhead);
        return true;
        
    }

    public ListNode reverse(ListNode head){
            if(head == null || head.next == null){
                return head;
            }

            ListNode newhead = reverse(head.next);

            ListNode front = head.next;
            front.next = head; 
            head.next = null;
            return newhead;
    }
}