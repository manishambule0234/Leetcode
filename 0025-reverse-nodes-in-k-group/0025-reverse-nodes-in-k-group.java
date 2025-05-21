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
    public static ListNode kthNode(ListNode temp,int k){
        k--;
        while(temp!=null&&k!=0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public static ListNode reverse(ListNode temp){
        ListNode prev = null, curr = temp, front = temp;
        while(curr != null){
            front = front.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevgrpLast=null;
        while(temp!=null){
            ListNode kthNode= kthNode(temp,k);
            if(kthNode==null){
                if(prevgrpLast!=null)
                prevgrpLast.next=temp;
                break;
            }
            ListNode nextnode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthNode;
            }
            else{
                prevgrpLast.next=kthNode;
            }
            prevgrpLast=temp;
            temp=nextnode;

        }
        return head;
    }
}