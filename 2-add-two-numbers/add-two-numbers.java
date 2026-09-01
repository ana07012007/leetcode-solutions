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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        ListNode head = new ListNode(-1);
        ListNode temp = head;

        while(temp1 != null && temp2 != null){
            int value = temp1.val + temp2.val;
            ListNode n = new ListNode(value);
            temp.next = n;
            temp = temp.next;
            if(carry == 1){
                temp.val += 1;
                carry--;
            }
            if(temp.val > 9){
                carry++;
                temp.val = temp.val % 10;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while(temp1 != null){
            temp.next = temp1;
            temp = temp.next;
            if(carry == 1){
                temp.val += 1;
                carry--;
            }
            if(temp.val > 9){
                temp.val = temp.val % 10;
                carry ++;
            }
            temp1 = temp1.next;
        }

        while(temp2 != null){
            temp.next = temp2;
            temp = temp.next;
            if(carry == 1){
                temp.val += 1;
                carry--;
            }
            if(temp.val > 9){
                temp.val = temp.val % 10;
                carry ++;
            }
            temp2 = temp2.next;
        }

        if(carry == 1){
            ListNode n = new ListNode(1);
            temp.next = n;
        }

        return head.next;
    }
}