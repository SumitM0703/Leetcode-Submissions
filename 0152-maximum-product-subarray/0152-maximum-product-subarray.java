class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int minend = nums[0];
        int maxend = nums[0];
        int result = nums[0];
        for(int i = 1 ; i< n ;i++){
            int v1 = nums[i];
            int v2 = minend*nums[i];
            int v3 = maxend*nums[i];
            maxend = Math.max(v1,Math.max(v2,v3));
            minend = Math.min(v1,Math.min(v2,v3));
            result = Math.max(result,Math.max(maxend,minend));
        }
        return result;
        
    }
}