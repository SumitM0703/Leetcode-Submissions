class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int result = arr[0];
        for(int i = 1 ; i<n ; i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;
            nodelete = Math.max(nodelete+arr[i],arr[i]);
            int v2;
            if(prevonedelete == Integer.MIN_VALUE){
                v2 = Integer.MIN_VALUE;
            }else{
                v2 = prevonedelete + arr[i];
            }
            onedelete = Math.max(prevnodelete,v2);
            result = Math.max(result, Math.max(nodelete, onedelete));
        }
        return result;

        
    }
}