# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        sptr = head
        fptr = head
        while(sptr and fptr):
            fptr = fptr.next
            if(fptr):
                fptr=fptr.next

                sptr = sptr.next
                if (sptr == fptr):
                    return True
            else:
                return False


        return False




