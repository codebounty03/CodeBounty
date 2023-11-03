class Solution:
    def length(self, x):
        return len(x)

    def getIntersectionNode(self, A, B,sa,sb):
        la = self.length(A)
        lb = self.length(B)
        a=A[sa:]
        b=B[sb:]
        
            
        # a = A
        # b = B
        while a and b:
            if la > lb:
                a = a[la]
                la -= 1
            elif la < lb:
                lb -= 1
                b = b[lb]
            else:
                if a == b:
                    return a
                else:
                    a += 1
                    b += 1

        
if __name__=="__main__":
    lista=[1,9,1,2,4]
    listb=[3,2,4]
    sa=3
    sb=1
    ll=Solution()
    result=ll.getIntersectionNode(lista,listb,sa,sb)
    print("Intersected at '"+str(result)+"'")
    