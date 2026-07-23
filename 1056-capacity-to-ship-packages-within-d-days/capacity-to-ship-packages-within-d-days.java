class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = Integer.MAX_VALUE;
        for(int i : weights){
            start = Math.max(start , i);
        }
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;

            int sum = 0;
            int day = 1;

            for(int i : weights){

                if(sum + i <= mid){
                    sum += i;
                }else{
                    sum = i;
                    day++;
                }
            }
            

            if(day <= days){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return ans;
    }
}