class Solution:
    def isPalindrome(self, x):
        
        if (x<0):
            return False
        i = x
        s = 0
        while (i>0):
            d = i % 10
            s = s * 10 + d
            i = i // 10
        if(x == s):
            return True
        else:
            return False 
        
sol = Solution()
is_palindrome = print(sol.isPalindrome(12121))
