#Count the digits in a number that divides the number

class Solution(object):
    def countDigits(self, num):
        temp = num
        ans = 0
        while temp > 0:
            r = temp % 10 #takes the last digit
            if num % r == 0:
               ans+=1
            temp = temp // 10 #removes the last digit
        return ans
     
num = int(input("Enter the number: "))
obj = Solution()
result = obj.countDigits(num) 

print("The count of divisible numbers are: " , result )

   
        
        