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
        if(head == null || head.next == null)return head;
        int length = length(head);
        int[] arr = new int[length];
        ListNode temp = head;
        for(int i = 0 ; i < length ; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }

        Arrays.sort(arr);
        temp = head;
        for(int i = 0 ; i < length ; i++){
            temp.val = arr[i];
            temp = temp.next;
        }

        return head;
    }

    public int length(ListNode head){
        ListNode temp = head;
        int ans = 0;
        while(temp != null){
            temp = temp.next;
            ans++;
        }

        return ans;
    }
}