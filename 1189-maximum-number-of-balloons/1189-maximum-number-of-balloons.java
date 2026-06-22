class Solution {
    public int maxNumberOfBalloons(String text) {
        int s = text.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<s ; i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int b = map.getOrDefault('b',0);
        int a = map.getOrDefault('a',0);
        int l = map.getOrDefault('l',0);
        int o = map.getOrDefault('o',0);
        int n = map.getOrDefault('n',0);
        int result =  Math.min(
                Math.min(b, a),
                Math.min(l / 2, Math.min(o / 2, n)));
        return result;
        
    }
}