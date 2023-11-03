class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merged_list = nums1 + nums2
        print(merged_list)
        merged_list.sort()  
        print(merged_list)
        total_elements = len(merged_list)

        if total_elements % 2 == 1:
            median = merged_list[total_elements // 2]
        else:
            median = (merged_list[total_elements // 2] + merged_list[total_elements // 2 - 1]) / 2

        return median
    

solution = Solution()

nums1 = [1, 3, 5]
nums2 = [2, 4, 6]
result = solution.findMedianSortedArrays(nums1, nums2)

print("Median:", result)
