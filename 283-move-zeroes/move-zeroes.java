class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            while( j < nums.length-1 && nums[j] == 0){
                j++;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j++;
        }
    }
}