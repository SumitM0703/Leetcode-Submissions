class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        low =0
        high=k
        total =0
        for i in range(k):
            total+=nums[i]
        maxsum = total
        while(high<len(nums)):
            total = total+nums[high]-nums[low]
            maxsum = max(maxsum,total)
            low+=1
            high+=1

        return maxsum/k

        