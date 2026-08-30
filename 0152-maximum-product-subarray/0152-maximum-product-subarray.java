class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxend = nums[0];
        int minend = nums[0];
        int result = nums[0];
        for(int i = 1  ; i<n ; i++){
            int val1 = nums[i];
            int val2 = maxend*nums[i];
            int val3 = minend*nums[i];
            maxend = Math.max(val1,Math.max(val2,val3));
            minend = Math.min(val1,Math.min(val2,val3));
            result = Math.max(result,Math.max(maxend,minend));
        }
        return result;
        
    }
}