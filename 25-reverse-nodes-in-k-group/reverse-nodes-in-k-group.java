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
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        len /= k;
        ListNode prev = null;
        ListNode curr = head;
        temp = head;
        
        
        for(int i = 0 ; i < len ; i++){
            int cnt = k;
            while(cnt-- > 0)temp = temp.next;
            if(i == 0){
                head = reverse(head , k);
                curr.next = temp;
                prev = curr;
                curr = temp;
            }else{
                ListNode newhead = reverse(curr , k);
                prev.next = newhead;
                curr.next = temp;
                prev = curr;
                curr = temp;
            }
        }

        return head;
        

    }

    public ListNode reverse(ListNode head , int count){
        if(count == 1)return head;

        ListNode newhead = reverse(head.next , count - 1);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newhead;
    }
}