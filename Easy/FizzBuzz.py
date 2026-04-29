class solution:
    def fizzbuzz(self , n):
        ans = []
        for i in range(1,n+1):
            if i%3==0 and i%5==0:
                ans.append("FizzBuzz")
            elif i%5==0:
                ans.append("Buzz")
            elif i%3==0:
                ans.append("Fizz")
            else:
                ans.append(str(i))
                
        return ans
    
n = int(input("Enter n: "))    
obj = solution()
result = obj.fizzbuzz(n)

for item in result:
    print(item)
