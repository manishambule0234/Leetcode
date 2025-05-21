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
    public static int size(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node =head;
        ListNode slow=head;
        ListNode fast=head;
        int n=k%size(head);
        if(n==0){
            return head;
        }
        while(n!=0){
            fast=fast.next;
            n--;
        }
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode first=slow.next;
        slow.next=null;
        fast.next=node;
        return first;
    }
}