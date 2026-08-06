class Solution {
    public static int productOfDigit(int n){
        int product = 1;
        while(n>0){
            int digit = n%10;
            product = product*digit;
            n = n/10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        int temp = n;
        while(productOfDigit(temp)%t !=0){
            temp = temp+1;
        }
        return temp;

        
    }
}