class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        max = 0
        map={}
        for num in nums:
            map[num] = map.get(num,0)+1
        for keys,values in map.items():
            if values>max:
                max = values
                result = keys
        return result
            

        