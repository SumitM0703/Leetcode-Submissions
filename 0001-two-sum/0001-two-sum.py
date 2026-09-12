class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i in range(len(nums)):
            number = nums[i]
            complement = target-number

            if complement in seen:
                return [seen[complement],i]
            else:
                seen[number] = i
        