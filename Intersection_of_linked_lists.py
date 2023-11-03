class Solution(object):
    def __init__(self):
        self.head = None

    

    def getIntersectionNode(self, A, B, SkipA, SkipB, intersectval):
        la = len(A)
        lb = len(B)
        counta = 0
        countb = 0
        for i in A:
            if i == intersectval:
                break
            else:
                counta += 1
                pass

        for j in B:
            if j == intersectval:
                break
            else:
                countb += 1
                pass

        return f"intersencted at '{A[counta]}'"

    

if __name__ == "__main__":
    A = [4, 1, 8, 4, 5]
    B = [5, 0, 1, 8, 4, 5]
    SkipA = 2
    SkipB = 3
    intersectval = 8
    solution = Solution()
    result = solution.getIntersectionNode(A, B, SkipA, SkipB, intersectval)
    print(result)
