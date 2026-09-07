class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> post = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            if(nums[i]>=0){
                post.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        for(int i = 0 ; i<post.size() ; i++){
            result.add(post.get(i));
            result.add(neg.get(i));

        }
        for(int i = 0 ; i<result.size();i++){
            arr[i] = result.get(i);
        }

        return arr;
        
    }
}