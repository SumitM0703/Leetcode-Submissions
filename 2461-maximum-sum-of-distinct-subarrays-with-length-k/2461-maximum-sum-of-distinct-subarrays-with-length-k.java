class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long maxSum = 0;

       
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        if (map.size() == k) {
            maxSum = sum;
        }

        int low = 0;
        int high = k;

        while (high < n) {

 
            sum -= nums[low];
            map.put(nums[low], map.get(nums[low]) - 1);

            if (map.get(nums[low]) == 0) {
                map.remove(nums[low]);
            }


            sum += nums[high];
            map.put(nums[high], map.getOrDefault(nums[high], 0) + 1);


            if (map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }

            low++;
            high++;
        }

        return maxSum;
    }
}