class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        pos = []
        neg = []
        res = []
        for i in range(n):
            if(nums[i]>0):
                pos.append(nums[i])
            else:
                neg.append(nums[i])
        for i in range(len(pos)):
            res.append(pos[i])
            res.append(neg[i])
        return res