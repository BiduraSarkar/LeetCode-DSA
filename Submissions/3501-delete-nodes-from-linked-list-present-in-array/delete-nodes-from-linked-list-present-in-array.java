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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        int max = 0;
        int L = nums.length;
        for(int i =0 ; i<L; i++)
           {
            if(nums[i] > max)
               max = nums[i];
           }
        int arr[] = new int [max+1];
                for(int i =0 ; i<L; i++)
           {
              arr[nums[i]] = 1;
           }

        while(head.val <= max  && arr[head.val] == 1)
        {  head = head.next; 
           if (head == null)
           break;
        }

        ListNode head2 = head;
        ListNode prev = null;
        while(head2 != null)
        {
            if(head2.val <= max && arr[head2.val] == 1)
              {   prev.next = head2.next;
                head2 = head2.next;
            } 
            else
            {prev = head2;
               head2 = head2.next;}
            
        }

        return head;
    }
}