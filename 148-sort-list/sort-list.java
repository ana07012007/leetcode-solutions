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
    public ListNode sortList(ListNode head) {
        return mergesort(head);
    }

    public ListNode mergesort(ListNode head){
        if(head == null || head.next == null)return head;

        ListNode mid = middle(head);
        ListNode lefthead = head;
        ListNode righthead = mid.next;
        mid.next = null;

        lefthead = mergesort(lefthead);
        righthead = mergesort(righthead);

        return merge(lefthead , righthead);
    }

    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode left , ListNode right){
        ListNode newhead = null;
        if(left.val <= right.val){
            newhead = left;
            left = left.next;
        }else{
            newhead = right;
            right = right.next;
        }

        ListNode temp = newhead;

        while(left != null && right != null){
            if(left.val <= right.val){
                temp.next = left;
                left = left.next;
            }else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return newhead;
    }
}