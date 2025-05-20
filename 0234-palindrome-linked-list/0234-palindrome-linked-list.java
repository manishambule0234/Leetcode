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
    static ListNode left;
    public static boolean checkPalindrome(ListNode right){
        if(right==null){
            return true;
        }
        boolean ans=checkPalindrome(right.next);
        if(ans==false){
            return false;
        }
        if(right.val!=left.val){
            return false;
        }
        else{
            left=left.next;
            return true;
        }
        
    }
    public boolean isPalindrome(ListNode head) {
         left=head;
        return checkPalindrome(head);
    }
}