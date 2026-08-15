class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int i = 1; i <= n + 1; i++) {
            if(!map.containsKey(i)) {
                return i;
            }
        }

        return n + 1;
    }
}