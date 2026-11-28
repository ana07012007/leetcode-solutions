class Solution {
    public int[] singleNumber(int[] nums) {
        int num = 0;
        for(int n : nums){
            num ^= n;
        }

        int bit = (num & (num-1)) ^ num;
        int ans1 = 0;
        int ans2 = 0;

        for(int n : nums){
            if((n & bit) == 0)ans1 ^= n;
            else ans2 ^= n;
        }

        return new int[]{ans1 , ans2};
        }
}