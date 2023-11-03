class Solution:
    def getIntersectionNode(self, listA, listB, skipA, skipB):
        a = listA
        b = listB

        # Skip nodes at the beginning of listA and listB
        for _ in range(skipA):
            if a is None:
                return None
            a = a.next

        for _ in range(skipB):
            if b is None:
                return None
            b = b.next

        while a and b:
            if a == b:
                return a
            a = a.next
            b = b.next

        return None

# Define a ListNode class for the example input
class ListNode:
    def __init__(self, value):
        self.val = value
        self.next = None

if __name__ == "__main__":
    listA = ListNode(4)
    listA.next = ListNode(1)
    listA.next.next = ListNode(8)
    listA.next.next.next = ListNode(4)
    listA.next.next.next.next = ListNode(5)

    listB = ListNode(5)
    listB.next = ListNode(6)
    listB.next.next = ListNode(1)
    listB.next.next.next = ListNode(8)
    listB.next.next.next.next = ListNode(4)
    listB.next.next.next.next.next = ListNode(5)

    skipA = 2
    skipB = 3

    solution = Solution()
    result = solution.getIntersectionNode(listA, listB, skipA, skipB)

    if result:
        print(f"Intersected at '{result.val}'")
    else:
        print("No intersection found.")
