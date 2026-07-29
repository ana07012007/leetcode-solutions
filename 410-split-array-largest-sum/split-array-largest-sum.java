class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i : nums){
            start = Math.max(start , i);
            end += i;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            int sum = 0;
            int cnt = 1;
            for(int i : nums){
                if(sum + i <= mid){
                    sum += i;
                }else{
                    sum = i;
                    cnt++;
                }
            }

            if(cnt <= k)end = mid - 1;
            else start = mid + 1;
        }

        return start;
    }
}