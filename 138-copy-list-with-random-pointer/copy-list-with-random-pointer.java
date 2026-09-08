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
        
        HashMap<Node , Node> headmap = new HashMap<>();

        Node temp = head;
        

        Node newhead = new Node(-1);
        Node curr = newhead;

        while(temp != null){
            Node newnode = new Node(temp.val);
            curr.next = newnode;
            curr = curr.next;
            
           headmap.put(temp, newnode);
         
            temp = temp.next;
        }  

        temp = head;
        curr = newhead.next;

        while(curr != null){
            curr.random = headmap.get(temp.random);
            curr = curr.next;
            temp = temp.next;
        }

        return newhead.next;

    }
}