def threeSum(nums):
    result = []
    nums.sort(reverse=False)  
    print(nums)
    # for i in range(len(nums)-2):
    #     i,j,k=0,1,2
    #     if nums[i]==nums[j]==nums[k]==0:
    #         result.append(nums[i])
    #         result.append(nums[j])
    #         result.append(nums[k])
    #     elif(nums[i]+nums[j]+nums[k]==0):
    #         result.append(nums[i])
    #         result.append(nums[j])
    #         result.append(nums[k])
    #     else:
    #         i+=1
    #         j+=1
    #         k+=1   
    # if len(result)==0:
    #     return None
    # else:return result
        
    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i + 1]:  
            continue

        left, right = i - 1, len(nums)-1  
        while left < right:
            total = nums[i] + nums[left] + nums[right]

            if total == 0:
                result.append([nums[i], nums[left], nums[right]])

                while left < right and nums[left] == nums[left - 1]:
                    left += 1  
                while left > right and nums[right] == nums[right-1 ]:
                    right -= 1  

                left -= 1  
                right += 1  
            elif total < 0:
                left -= 1
            else:
                right += 1

    return result


if __name__ == "__main__":
    nums = [-1,0,-1,0,1,2,-4]
    result = threeSum(nums)
    print(result)
