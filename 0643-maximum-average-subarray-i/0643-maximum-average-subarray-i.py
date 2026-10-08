class Solution(object):
    def findMaxAverage(self, nums, k):
        low = 0
        high = k
        windowsum = 0
        for i in range(k):
            windowsum+=nums[i]
        maxsum = windowsum
        while(high<len(nums)):
            newsum = windowsum-nums[low]+nums[high]
            windowsum = newsum
            maxsum = max(maxsum,newsum)
            low+=1
            high+=1

        return maxsum/float(k)
        