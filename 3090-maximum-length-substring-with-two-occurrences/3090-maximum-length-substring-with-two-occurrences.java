class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int low = 0;
        int high = 0;
        int maxlength = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(high<n){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            while(map.get(s.charAt(high))>2){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                low++;
            }
            maxlength = Math.max(maxlength,high-low+1);
            high++;
        }
        return maxlength;
        
    }
}