class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = piles[0];
        for(int i = 0 ; i < piles.length ; i++){
            end = Math.max(end , piles[i]);
        }
        int ans = end;

        while(start <= end){
            int mid = start + (end - start)/2;
            long time = 0;
            for(int i = 0 ; i < piles.length ; i++){
                if(piles[i] % mid == 0)time += piles[i]/mid;
                else time += (piles[i]/mid)+1; 
            }

            if(time <= h){
                end = mid - 1;
                ans = Math.min(ans , mid);
            }
            else{
                start = mid + 1;
            }

        }

        return ans;
    }
}