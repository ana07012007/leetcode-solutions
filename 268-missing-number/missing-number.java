class Solution {
    public int missingNumber(int[] nums) {
        cyclic(nums);
        for(int i =0; i< nums.length ; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    static void cyclic(int[] nums){
        int i =0;
        while(i<nums.length){
            int correct = nums[i];
            if(correct == nums.length){
                i++;
            }
            else if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}