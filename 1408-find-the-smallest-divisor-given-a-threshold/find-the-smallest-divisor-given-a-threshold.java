class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = 0;
        for(int num: nums){
            end = Math.max(end , num);
        }
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + ( end - start)/2;
            int sum = 0;
            for(int i : nums){
                if(i % mid == 0)sum += i/mid;
                else sum += (i/mid)+1;
            }

            if(sum <= threshold){
                ans = Math.min(ans , mid);
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return ans;
    }
}