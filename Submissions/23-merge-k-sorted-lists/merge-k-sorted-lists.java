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
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        
        List<Integer> L = new ArrayList<>();

        for(int i=0; i<k ; i++)
        {
            ListNode head = lists[i];
            while(head != null)
            {
                L.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(L);
        ListNode head = null;
        ListNode result = null;

        for(Integer item : L)
        {
            ListNode e = new ListNode(item, null);
            if(head == null)
            head = e;
            else
            {head.next = e;
            head = head.next;}
            if(result == null)
            result = head;

        }
        return result;

    }
}