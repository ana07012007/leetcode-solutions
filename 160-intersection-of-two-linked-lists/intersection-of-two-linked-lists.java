/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        ListNode tempA = headA;
        ListNode tempB = headB;

        if(lenA >= lenB){
            int cnt = lenA - lenB;
            while(cnt-- > 0){
                tempA = tempA.next;
            }
        }else{
            int cnt = lenB - lenA;
            while(cnt-- > 0){
                tempB = tempB.next;
            }
        }


        while(tempA != null && tempB != null){
            if(tempA == tempB)return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }

    public int length(ListNode head){
        ListNode temp = head;
        int ans = 0;

        while(temp != null){
            ans++;
            temp = temp.next;
        }
        return ans;
    }
}