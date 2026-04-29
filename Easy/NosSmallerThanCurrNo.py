#How many numbers are smaller than the current number

class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        ans = []
        for i in nums:
            count = 0
            for j in nums:
                if j<i:
                    count+=1
            ans.append(count)
        return ans       
 
              
n = int(input("Enter the array length: "))  
nums =[]

print("Enter the numbers: ")
for i in range(n):
    nums.append(int(input()))
    
obj = Solution()
result = obj.smallerNumbersThanCurrent(nums)
print("The numbers smaller than the current number are: " , result)