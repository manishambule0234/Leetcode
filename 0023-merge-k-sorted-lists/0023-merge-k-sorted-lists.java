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
        public static class Pair implements Comparable<Pair> {
        ListNode node;

        Pair(ListNode node) {
            this.node = node;
        }

        public int compareTo(Pair o) {
            return this.node.val - o.node.val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(new Pair(lists[i]));
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            Pair top = pq.remove();
            curr.next = top.node;
            curr = curr.next;

            if (top.node.next != null) {
                pq.add(new Pair(top.node.next));
            }
        }

        return dummy.next;
    }
}