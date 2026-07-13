class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid % 2 == 0){
                if(mid - 1 >= 0 && nums[mid] == nums[mid - 1])end = mid -1;
                else if(mid + 1 < nums.length && nums[mid] == nums[mid + 1])start= mid+1;
                else return nums[mid];
            }
            else{
                if(mid - 1 >= 0 && nums[mid] == nums[mid - 1])start = mid + 1;
                else if(mid + 1 < nums.length && nums[mid] == nums[mid + 1])end = mid -1;
                else return nums[mid];
            }
        }

        return -1;
    }
}