class ListNode:
   def __init__(self, data, next = None):
      self.data = data
      self.next = next
class Solution(object):
   def getIntersectionNode(self, headA, headB):
      
      dict = {}
      while headA:
         dict[headA]=1
         headA = headA.next
      while headB:
         if headB in dict:
            return headB
         headB = headB.next
      return None
headA = ListNode(4)
headB = ListNode(5)
Intersect = ListNode(8, ListNode(4, ListNode(5)))
headA.next = ListNode(1, Intersect)
headB.next = ListNode(0, ListNode(1, Intersect))
ob1 = Solution()
op = ob1.getIntersectionNode(headA, headB)
print("Intersection:",op.data)
