class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum =0;
        for(int i =0;i<k ; i++ ){
            sum+= nums[i];
        }
        int maxsum  = sum;
        int low = 0;
        int high = k;
        while(high<n){
            sum = sum - nums[low];
            sum = sum+ nums[high];
            
            maxsum = Math.max(maxsum,sum);
            low++;
            high++;
        }
        return (double) maxsum / k;
        
    }
}