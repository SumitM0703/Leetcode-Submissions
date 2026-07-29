class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int low =0;
        int high =0;
        int maxSum =0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(high<n){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            while(map.get(nums[high])>1){
                map.put(nums[low],map.getOrDefault(nums[low],0)-1);
                sum = sum-nums[low];
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
                low++;
            }
       
            sum = sum+nums[high];
            maxSum = Math.max(sum,maxSum);
            high++;
        }
        return maxSum;
        
    }
}