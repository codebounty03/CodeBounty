class Solution(object):
    def generateParenthesis(self, n):
        def generate(n, currentString, open_count, close_count):
            if open_count == n and close_count == n:
                return [currentString]
            
            allPossibleVariations = []
            
            if open_count < n:
                getSubVariations = generate(n, currentString + "(", open_count + 1, close_count)
                allPossibleVariations.extend(getSubVariations)
            
            if close_count < open_count:
                getSubVariations = generate(n, currentString + ")", open_count, close_count + 1)
                allPossibleVariations.extend(getSubVariations)
            
            return allPossibleVariations
        
        return generate(n, '', 0, 0)

solution = Solution()
n = 3  # Change n to the desired value
result = solution.generateParenthesis(n)

for combination in result:
    print(combination)
