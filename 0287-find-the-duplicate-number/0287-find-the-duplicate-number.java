class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int duplicate = nums[0];
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==2){
                  duplicate = nums[i];
            }
        }
        return duplicate;
        
    }
}