class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int i = 0;
        int j = nums.length -1;
        while(i <= end){
            if(i != start && nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }
            else if(i != end && nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }else{
                i++;
            }
           
        }

    }
}