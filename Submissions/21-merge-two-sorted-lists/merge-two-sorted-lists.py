# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        L = None
        head = None
        while list1 != None and list2 != None:
            if list1.val <= list2.val:
                L2 = ListNode(list1.val,None)
                list1 = list1.next

            else:
                L2 = ListNode(list2.val,None)
                list2 = list2.next
            
            if  L == None:
                L = L2
                head = L
            else:
                L.next = L2
                L = L.next
        
        while list1 != None:
            L2 = ListNode(list1.val,None)
            if  L == None:
                L = L2
                head = L
            else:
                L.next = L2
                L = L.next 
            list1 = list1.next
        
        while list2 != None:
            L2 = ListNode(list2.val,None)
            if  L == None:
                L = L2
                head = L
            else:
                L.next = L2
                L = L.next 
            list2 = list2.next

        return head

        