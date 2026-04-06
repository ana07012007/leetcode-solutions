class Solution {
    public int search(int[] nums, int target) {
        return binsearch(nums , target , 0 , nums.length-1);
    }

    static int binsearch(int[] nums , int target , int start , int end){
        int mid = start + (end-start)/2;
        if(start > end){
            return -1;
        }
        if(target == nums[mid]){
            return mid;
        }else if(target > nums[mid]){
            return binsearch(nums , target , mid+1 , end);
        }else{
            return binsearch(nums , target , start , mid -1);
        }

        
    }
}