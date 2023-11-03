class Solution:
    def length(self, x):
        l = 0
        while x:
            l += 1
            x = x.next
        return l

    def getIntersectionNode(self, A, B):
        a = A
        b = B
        la = self.length(a)
        lb = self.length(b)
        while a and b:
            if la > lb:
                la -= 1
                a = a.next
            elif la < lb:
                lb -= 1
                b = b.next
            else:
                if a == b:
                    return a
                a = a.next
                b = b.next
                la -= 1
                lb -= 1
        return None
