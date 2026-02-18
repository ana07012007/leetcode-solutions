class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        int count =0;
       
       for(int i =0; i< nums.length-2 ; i++){
        int left = i+1;
        int right = nums.length -1;
        int mul = nums[i] * nums[left] * nums[right];
        while(left <= right){
            ans = Math.max(mul , ans);
            right--;
            mul = nums[i] * nums[left] * nums[right];
        }
       }
        return ans;
        
    }
}