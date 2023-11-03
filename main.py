class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merged_list = nums1 + nums2
        merged_list.sort(reverse=True)  
        total_elements = len(merged_list)

        if total_elements % 2 == 1:
            eve=float(merged_list[total_elements // 2 and total_elements //2 + 1])
            answer=eve//2
            return answer
        else:
            middle1 =merged_list[(total_elements)//2]
            middle2 = merged_list[total_elements // 2 - 1]
            answer=[(middle1+middle2)/2] 
            return answer

solution = Solution()

nums1 = [1 ,3 ,5]
nums2 = [2, 4, 6]
result = (solution.findMedianSortedArrays(nums1, nums2))

print("Median:", result)