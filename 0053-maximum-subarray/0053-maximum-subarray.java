class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int answer = nums[0];
        int bestend = nums[0];
        for(int i = 1 ; i<n;i++){
            int val1 = bestend+nums[i];
            int val2 = nums[i];
            bestend = Math.max(val1,val2);
            answer = Math.max(bestend,answer);
        }
        return answer;
        
    }
}