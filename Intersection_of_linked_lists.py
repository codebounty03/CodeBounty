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
                if a == b:
                    return a
                else:
                    a += 1
                    b += 1

        return None
    

result = Solution().getIntersectionNode([1,1,1,1], [2,2,2,2])

print(f"Intersected at " + result)