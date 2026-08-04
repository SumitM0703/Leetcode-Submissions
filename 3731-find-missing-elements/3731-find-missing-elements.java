class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        for (int i = nums[0]; i <= nums[n - 1]; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                list.add(i);
            }
        }

        return list;
    }
}