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
    public ListNode middleNode(ListNode head) {
        int size = findLength(head);
        ListNode temp = head;
        int count = 0;
        if(size % 2 == 0){
            while(count < (size/2)){
                temp = temp.next;
                count++;
            }

            return temp;
        }
            while(count < size/2){
                temp = temp.next;
                count++;
            }

            return temp;
        

           
    }

    public int findLength(ListNode head){
        ListNode temp = head;

        int ans = 0;
        while(temp != null){
            temp = temp.next;
            ans++;
        }return ans;
    }
}