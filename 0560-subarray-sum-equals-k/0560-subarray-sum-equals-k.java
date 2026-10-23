class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int pre_sum = 0;
        int count = 0;
        for(int num : nums){
            pre_sum+=num;
            if(map.containsKey(pre_sum-k)){
                count+=map.get(pre_sum-k);
            }
             map.put(pre_sum, map.getOrDefault(pre_sum, 0) + 1);
        }
        return count;
        
    }
}