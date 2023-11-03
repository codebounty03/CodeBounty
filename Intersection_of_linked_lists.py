class Solution:
    def length(self, x):
        l = 0
        while x:
            l += 1
            x = x.next
        return l

    def getIntersectionNode(self, A, B):
        la = self.length(A)
        lb = self.length(B)

        a = A
        b = B
        while a and b:
            if la > lb:
                la -= 1
                a = a.next
            elif la < lb:
                lb -= 1
                b = b.next
            else:
                if a.data == b.data:
                    return a
                else:
                    a = a.next
                    b = b.next 

        return None