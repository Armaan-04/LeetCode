#Subtract product and sum of the digits of an integer

class Solution(object):
    def subtractProductAndSum(self, n):      
        summ = 0
        temp = n
        prod = 1
            
        while temp > 0:
            r = temp % 10
            summ = summ + r
            prod = prod * r
            temp = temp // 10  
        return prod - summ
    
    
n = int(input("Enter the number: "))
obj = Solution()
result = obj.subtractProductAndSum(n)

print("The difference between the sum and the prodct is: " , result)
    
    
    
    
    
    

       