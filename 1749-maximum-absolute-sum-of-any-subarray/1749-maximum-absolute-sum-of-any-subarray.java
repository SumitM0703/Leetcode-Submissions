class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxend = nums[0];
        int answer = Math.abs(nums[0]);
        int minend = nums[0];
        for(int i = 1 ;i<n ; i++){
           int val1 = nums[i];
           int val2 = nums[i] + maxend;
           int val3 = nums[i] + minend;
           maxend = Math.max(val1,Math.max(val2,val3));
           minend = Math.min(val1,Math.min(val2,val3));
           answer = Math.max(answer,Math.max(Math.abs(maxend),Math.abs(minend)));

        }
        return answer;
        
    }
}