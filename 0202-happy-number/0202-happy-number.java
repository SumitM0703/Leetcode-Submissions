class Solution {
    public static int CalculateSquareSum(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            n = n/10;
            sum = sum + digit*digit;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1){
            slow = CalculateSquareSum(slow);
            fast = CalculateSquareSum(CalculateSquareSum(fast));
            if(slow == fast && slow!=1){
                return false;
            }
        }
        return true;
        
    }
}