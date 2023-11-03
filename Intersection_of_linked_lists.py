class Solution:
    def length(self, head):
        l = 0
        while head:
            l += 1
            head = head.next
        return l

    def getIntersectionNode(self, headA, headB):
        lenA = self.length(headA)
        lenB = self.length(headB)

        diff = abs(lenA - lenB)

        if lenA > lenB:
            for _ in range(diff):
                headA = headA.next
        else:
            for _ in range(diff):
                headB = headB.next

        while headA and headB:
            if headA == headB:
                return headA
            headA = headA.next
            headB = headB.next

        return None