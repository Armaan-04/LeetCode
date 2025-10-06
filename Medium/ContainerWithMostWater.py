class Solution:
    def maxArea(self, height):
        n = len(height)
        L = 0
        R = n - 1
        max_area = 0
        
        while L < R:
            w = R - L
            h = min(height[L], height[R])
            a = w * h
            max_area = max(max_area, a)
            
            if height[L] < height[R]:
                L = L + 1
            else:
                R = R - 1
        
        return max_area  

container = Solution()
maximum_area = print(container.maxArea([1,8,6,2,5,4,8,3,7]))
