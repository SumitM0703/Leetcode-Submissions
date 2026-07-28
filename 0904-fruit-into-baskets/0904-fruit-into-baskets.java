class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low =0;
        int high = 0;
        int maxcount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(high<n){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            if(map.size() <=2){
                int count = high-low+1;
                maxcount = Math.max(maxcount,count);
            }else{
                map.put(fruits[low], map.get(fruits[low]) - 1);
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            high++;
            
        }
        return maxcount;
        
    }
}