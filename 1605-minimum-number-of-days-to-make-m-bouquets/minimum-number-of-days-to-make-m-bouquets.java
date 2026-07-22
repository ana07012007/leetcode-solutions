class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k > bloomDay.length)return -1;

        int start = Integer.MAX_VALUE;
        int end = 0;

        for(int i : bloomDay){
            start = Math.min(start , i);
            end = Math.max(end , i);
        }
        int ans = Integer.MAX_VALUE;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int cnt = 0;
            int a = m;
            for(int nums : bloomDay){
                if(nums <= mid){
                    cnt++;
                }else{
                    a -= cnt / k;
                    cnt = 0;
                }
            }
            a -= cnt / k;

            if(a > 0){
                start = mid + 1;
            }else{
                end = mid - 1;
                ans = Math.min(ans , mid);
            }

        }

        if(ans == Integer.MAX_VALUE)return -1;
        else return ans;
    }
}