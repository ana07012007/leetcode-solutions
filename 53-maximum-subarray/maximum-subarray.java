class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cs =0;
        for(int i =0; i< nums.length ; i++){
            cs = cs+ nums[i];
            max = Math.max(cs,max);
            if(cs<0){
                cs=0;
            }
            // int sum =0;
            
            // for(int j =i ; j< nums.length ; j++){
            //     sum += nums[j];
            //     if(sum > max){
            //         max = sum;
            //     }
                
            // }
        }

        return max;
    }
}