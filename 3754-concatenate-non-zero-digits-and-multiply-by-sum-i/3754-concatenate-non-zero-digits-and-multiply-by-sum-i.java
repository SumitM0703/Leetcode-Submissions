class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int number = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n>0){
            int lastdigit = n%10;
            if(lastdigit!=0){
                arr.add(lastdigit);
                sum+=lastdigit;
                 n = n/10;
            }else{
               n = n/10; 
               continue;
            }
           

        }
        Collections.reverse(arr);
        for(int i = 0;i<arr.size();i++){
             number = number*10+arr.get(i);
        }
        return (long)number*sum;
        
    }
}