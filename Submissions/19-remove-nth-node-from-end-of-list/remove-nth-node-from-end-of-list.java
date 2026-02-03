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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head2 = head;
        ListNode head3 = head;
        int len=0;
        while(head2 != null)
        {
            head2 = head2.next;
            len++;
        }
        n = len-n;
        for(int i= 1; i<n;i++)
        {
            head3 = head3.next;
        }
        if(n==0)
        return head.next;
        head3.next = head3.next.next;
        return head;
    }
}