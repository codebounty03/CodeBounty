def threeSum(nums):
    result = []
    nums.sort(reverse=True)  

    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i + 1]:  
            continue

        left, right = i - 1, len(nums)  
        while left < right:
            total = nums[i] + nums[left] + nums[right]

            if total == 0:
                result.append([nums[i], nums[left], nums[right]])

                while left < right and nums[left] == nums[left - 1]:
                    left += 1  
                while left < right and nums[right] == nums[right + 1]:
                    right -= 1  

                left -= 1  
                right += 1  
            elif total < 0:
                left -= 1
            else:
                right += 1

    return result


if __name__ == "__main__":
    nums = [1, 1, 1, 1, 1];value
    result = threeSum(nums)
    print(result)
