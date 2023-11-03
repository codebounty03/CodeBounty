class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merged_list = nums1 + nums2
        merged_list.sort()  
        total_elements = len(merged_list)
          
        if (total_elements%2!=0):
            a=total_elements//2
            return merged_list[a-1]
        else:
            b=total_elements//2
            c=(merged_list[b-1]+merged_list[b])/2
            return c
            

solution = Solution()

nums1 = [1, 3, 5,7,9]
nums2 = [2, 4, 6]
result = solution.findMedianSortedArrays(nums1, nums2)

print("Median:", result)
