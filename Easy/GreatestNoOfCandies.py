#Kids with the greatest number of candies

class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        maxCandies = max(candies)
        ans = []
        
        for i in candies:
            if (i + extraCandies) >= maxCandies:
                ans.append(True)
            else:
                ans.append(False)
        return ans
    

n = int(input("Enter total number of kids: "))
candies = []

print("Enter the number of candies for each kid: ")

for i in range(n):
    candies.append(int(input()))
    
extraCandies = int(input("Enter number of extra candies: "))

obj = Solution()
result = obj.kidsWithCandies(candies , extraCandies)
print(result)