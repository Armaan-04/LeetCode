class Solution(object):
    def runningSum(self, nums):
        ans = []
        ans.append(nums[0])

        for i in range(1,(len(nums))):
            x = nums[i] + ans[i-1]
            ans.append(x)
        return ans