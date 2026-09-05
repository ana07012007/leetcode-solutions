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
        ListNode prevNode = null;
        
        while(temp != null){
            ListNode kthNode = findkthnode(temp , k);

            if(kthNode == null){
                prevNode.next = temp;
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            ListNode rev = reverse(temp);

            if(temp == head){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)return head;

        ListNode newhead = reverse(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newhead;
    }

    public ListNode findkthnode(ListNode head , int k){
        ListNode temp = head;
        while(k-- > 1 && temp != null)temp = temp.next;

        return temp;
    }
}