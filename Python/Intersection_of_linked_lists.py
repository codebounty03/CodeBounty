class Solution:
    def length(self, x):
        l = 0
        while x is not None:
            l += 1
            x = x.next
        return l

    def getIntersectionNode(self, A, B):
        la = self.length(A)
        lb = self.length(B)

        a = A
        b = B
        while (a is not None) and (b is not None):
            
            if a.data == b.data:
                return a.data
                
            else:
                a =a.next
                b =b.next

        return None
