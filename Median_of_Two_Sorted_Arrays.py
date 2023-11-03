'''

                            Online Python Compiler.
                Code, Compile, Run and Debug python program online.
Write your code in this editor and press "Run" button to execute it.

'''
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merged_list = nums1 + nums2
        merged_list.sort(reverse=True)  
        total_elements = len(merged_list)

        if total_elements % 2 != 0:
            a=int(total_elements / 2)
            return float(merged_list[a])
        else:
            a=int(total_elements / 2 + 1)
            b=merged_list[a+1]
            c=merged_list[a-1]
            return float(b+c/2)
           #
             

solution = Solution()

nums1 = [1, 3, 5]
nums2 = [2, 4]
result = solution.findMedianSortedArrays(nums1, nums2)

print("Median:", result)


