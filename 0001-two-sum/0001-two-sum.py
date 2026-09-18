class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        seen = {}
        for i in range(len(nums)):
            num = nums[i]
            remaining = target-num
            if remaining in seen:
                return seen[remaining],i
            else:
                seen[nums[i]] = i 
        