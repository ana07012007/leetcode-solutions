class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        while(curr <= right){
           
            if(curr != left && nums[curr] == 0){
                swap(nums , curr , left);
                left++;
            }
            else if(curr != right && nums[curr] == 2){
                swap(nums , curr , right);
                right--;
            }else{
                curr++;
            }
            
            
        }
    }

    public void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}