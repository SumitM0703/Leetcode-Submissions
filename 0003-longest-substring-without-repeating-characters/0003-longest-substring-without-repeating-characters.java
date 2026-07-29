class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low =0;
        int high = 0;
        int maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(high<n){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            while(map.get(s.charAt(high))>1){
                map.put(s.charAt(low),map.getOrDefault(s.charAt(low),0)-1);
                if(map.get(s.charAt(low))==0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            int count = high-low+1;
            maxLen = Math.max(count,maxLen);
            high++;
        }
        return maxLen;



        
    }
}