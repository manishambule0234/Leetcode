
// // Definition for a Node.
// class Node {
//     int val;
//     Node next;
//     Node random;

//     public Node(int val) {
//         this.val = val;
//         this.next = null;
//         this.random = null;
//     }
// }


class Solution {
    public static void insertCopyInBetween(Node head){
        Node temp=head;
        while(temp!=null){
            Node copy=new Node (temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=copy.next;
        }
    }
    public static void connectRandomPointers(Node head){
        Node temp = head;
        while (temp != null) {
            if (temp.random != null && temp.next != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next; // Move to next original node
        }}
        public static Node getDeepCopyList(Node head){
            Node dummy=new Node(-1);
            Node temp=head;
            Node res=dummy;
            while(temp!=null){
                res.next=temp.next;
                res=res.next;

                temp.next=temp.next.next;
                temp=temp.next;
            }
            return dummy.next;
        }
    
    public Node copyRandomList(Node head) {
    if (head == null) return null;

    // Step 1: Insert copy of
    // nodes in between
    insertCopyInBetween(head);
    // Step 2: Connect random
    // pointers of copied nodes
    connectRandomPointers(head);
    // Step 3: Retrieve the deep
    // copy of the linked list
    return getDeepCopyList(head);
    }
}