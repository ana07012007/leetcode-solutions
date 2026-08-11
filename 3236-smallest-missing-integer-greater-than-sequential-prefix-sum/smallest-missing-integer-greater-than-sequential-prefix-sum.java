class Solution {
    public int missingInteger(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i - 1]+ 1){
                sum += nums[i];
                max = Math.max(max , sum);
            }
            else break;
            
        }

        return ans(nums , max);
    }

    public int ans(int[] nums , int ans){
        int max = Integer.MIN_VALUE;

        for(int i : nums)max = Math.max(max , i);

        for(int i = ans ; i <= max + 1; i++){
            boolean check = true;
            for(int j = 0; j < nums.length ; j++){
                if(nums[j] == i){
                    check = false;
                    break;
                }
            }
            if(check)return i;
        }

        return ans;
    }
}