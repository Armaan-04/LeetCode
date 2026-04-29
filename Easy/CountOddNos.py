#Count odd numbers in an interval range

class Solution(object):
    def countOdds(self, low, high):
        count = []
        for i in range(low , high+1):
            if i%2!=0:
                count.append(i)
                
        return count
    
low = int(input("Enter the lower range: "))
high = int(input("Enter the higher range: "))
obj = Solution()
result = obj.countOdds(low , high)


print(f"The odd numbers between {low} and {high} are {result}")