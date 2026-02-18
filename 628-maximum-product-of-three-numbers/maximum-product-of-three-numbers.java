class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length -1;
        int pro1 = nums[n] * nums[n-1] * nums[n-2];
        int pro2 = nums[0] * nums[1] * nums[n];
        if(pro1 > pro2){
            return pro1;
        }else{
            return pro2;
        }
    }
}