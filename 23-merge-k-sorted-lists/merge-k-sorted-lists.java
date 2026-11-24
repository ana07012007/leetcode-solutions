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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)return null;
        if(lists.length == 1)return lists[0];
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        for(int i = 0 ; i < lists.length -1 ; i++){
            temp.next = lists[i];
            while(temp != null && temp.next != null)temp = temp.next;
            if(temp != null )temp.next = lists[i + 1];
        }
        

        return mergesort(head.next);
    }

    public ListNode mergesort(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode middle = midnode(head);
        ListNode temp = middle.next;
        middle.next = null;
        ListNode left = mergesort(head);
        ListNode right = mergesort(temp);
       

        return merge(left , right);
    }

    public ListNode merge(ListNode left , ListNode right){
        ListNode ltemp = left;
        ListNode rtemp = right;
        ListNode temp = new ListNode(-1);
        ListNode head = temp;

        while(ltemp != null && rtemp != null){
            if(ltemp.val <= rtemp.val){
                temp.next = ltemp;
                temp = temp.next;
                ltemp = ltemp.next;
            }else{
                temp.next = rtemp;
                temp = temp.next;
                rtemp = rtemp.next;
            }
        }

        if(ltemp != null)temp.next = ltemp;
        else temp.next = rtemp;

        return head.next;
    }

    public ListNode midnode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}