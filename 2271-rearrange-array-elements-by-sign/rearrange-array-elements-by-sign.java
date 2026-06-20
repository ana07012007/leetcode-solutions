class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];

        int e = 0;
        int o = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){
                arr[o] = nums[i];
                o += 2;
            }else{
                arr[e] = nums[i];
                e += 2;
            }
        }

        return arr;
    }
}