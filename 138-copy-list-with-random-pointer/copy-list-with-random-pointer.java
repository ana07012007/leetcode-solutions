/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;

        while(temp != null){
            Node newnode = new Node(temp.val);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = temp.next.next;
        }

        temp = head;
        while(temp != null){
            if(temp.random == null)temp.next.random = null;
            else temp.next.random = temp.random.next;
            temp = temp.next.next;
        }

        temp = head;

        Node newhead = new Node(-1);
        Node curr = newhead;

        while(temp != null){
            curr.next = temp.next;
            curr = curr.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }

        return newhead.next;

    }
}