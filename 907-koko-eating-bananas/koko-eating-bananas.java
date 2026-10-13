class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = 0;
        for(int nums: piles){
            right = Math.max(right , nums);
        }

        int left = 1;
        while(left < right){
            int mid = (left + right)/2;
            
            int count = 0;

            for(int i = 0 ;i < piles.length ; i++){
                count += (piles[i] + mid - 1)/mid;
            }
            

            if(count <= h){
                right = mid;
            }else{
                left = mid + 1;
            }  
            
        }

        return left;
    }
}