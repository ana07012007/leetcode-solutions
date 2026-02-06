class Solution {
    public boolean search(int[] nums, int target) {
        int k = pivot(nums);

        int start = 0;
        int end = k;

        if(binarysearch(nums , target , start , end)){
            return true;
        }else{
            start = k+1;
            end = nums.length-1;
            if(binarysearch(nums , target , start , end)){
                return true;
            }
        }

        return false;
    }

    static int pivot(int[] nums){
        int start =0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(nums[mid] > nums[mid+1]){
                return mid;
            }
            if(nums[mid] < nums[end]){
                end = mid;
            
            }else if(nums[mid] > nums[start]){
                start = mid;
            }else if(nums[start]==nums[start+1]){
                start++;
            }
            else{
                end--;
            }
        }
            
        

        return start;
    }


    static boolean binarysearch(int[] arr , int target , int start , int end){

        while(start<=end){
            int mid = start + (end-start)/3;

            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}