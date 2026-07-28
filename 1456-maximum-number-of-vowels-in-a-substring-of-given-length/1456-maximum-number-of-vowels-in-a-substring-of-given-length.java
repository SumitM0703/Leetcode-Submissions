class Solution {
    public int maxVowels(String s, int k) { 
        int n = s.length();
        int count = 0;
        char[] arr = new char[n];
        arr = s.toCharArray();
        for(int i = 0 ; i<k ;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        int maxcount =count;
        int low = 0;
        int high = k;
        while(high<n){
            if(s.charAt(low)=='a'||s.charAt(low)=='e'||s.charAt(low)=='i'||s.charAt(low)=='o'||s.charAt(low)=='u'){
                count--;
            }
            if(s.charAt(high)=='a'||s.charAt(high)=='e'||s.charAt(high)=='i'||s.charAt(high)=='o'||s.charAt(high)=='u'){
                count++;
            }
            maxcount = Math.max(count,maxcount);
            low++;
            high++;



        }
        return maxcount;
        
    }
}