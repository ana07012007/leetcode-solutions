class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        
        while(i < nums.length){
            int num = nums[i];
            
            while(i < nums.length && nums[i] == num){
                i++;
            }
            nums[j] = num;
            j++;
        }

        return j;
    }
}