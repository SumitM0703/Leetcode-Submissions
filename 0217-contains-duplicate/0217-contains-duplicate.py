class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        map = {}
        n = len(nums)
        for num in nums:
            map[num] = map.get(num,0)+1
        for val in map.values():
            if val==2 or val>2:
                return True
        
        return False


        