class Solution:
    def length(self, x):
        l = 0
        x = x.head
        while x:
            l += 1
            x = x.next
        return l

    def getIntersectionNode(self, A, B):
        la = self.length(A)
        lb = self.length(B)

        a = A.head
        b = B.head
        while a and b:
            if la > lb:
                la -= 1
                a = a.next
            elif la < lb:
                lb -= 1
                b = b.next
            else:
                if a == b:
                    return a.data
                else:
                    a = a.next
                    b  = b.next

        return None
