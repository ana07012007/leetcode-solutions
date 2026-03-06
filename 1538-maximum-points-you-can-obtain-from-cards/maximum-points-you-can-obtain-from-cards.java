class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum = 0;
        int rsum = 0;

        int sum = 0 ;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < k ; i++){
            lsum += arr[i];
        }
        max = Math.max(max , lsum);
        int right = arr.length - 1;
        for(int i = k-1 ; i >= 0 ; i--){
            lsum -= arr[i];
            rsum += arr[right];
            right--;
            max = Math.max(max , lsum + rsum);
        }

        return max;
    }
}