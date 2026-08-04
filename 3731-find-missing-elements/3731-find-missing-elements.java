class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new  HashMap<>();
        int min = nums[0];
        int max = nums[n-1];
        for(int i = 0 ; i<n ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i = min ; i<=max; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}