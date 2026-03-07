class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0 , max = 0 , left = 0, right = 0;

        while(right < nums.length ){
            if(nums[right] == 0)count++;

            if(count > k){
                if(nums[left] == 0){
                    count--;
                }
                left++;

            }
            

            right++;
            max = Math.max(max , right - left);
        }
        
        return max;
    }
}