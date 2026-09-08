class Solution {
    public int countCommas(int n) {
        int count =0;
        int result =0;
        int temp = n;
        while(temp>0){
            int digits = temp%10;
            temp = temp/10;
            count = count+1;
        }
        if(count<4){
            result = -1;
        }
        if(count == 4){
            result = n-1000;
        }
        if(count ==5){
            result = (n - 10000)+9000;
        }
        if(count == 6){
            result = (n-100000)+99000;
        }
            return result+1;
        }

    }
