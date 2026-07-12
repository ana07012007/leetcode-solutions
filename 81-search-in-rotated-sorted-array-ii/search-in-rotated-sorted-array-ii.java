class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = pivot(nums);
        boolean ans = binarysearch(nums , 0 , pivot , target);

        if(!ans){
            ans = binarysearch(nums , pivot+1 , nums.length - 1, target);
        }

        return ans;
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid + 1 < arr.length && arr[mid] > arr[mid] + 1){
                return mid;
            }
            if(arr[mid] > arr[start]){
                start = mid;
            }
            else if(arr[mid] < arr[end]){
                end = mid;
            }else if(start+1 < arr.length && arr[start] == arr[start+1]){
                start++;
            }
            else{
                end--;
            }
        }
        return start;
    }

    static boolean binarysearch(int[] arr , int start , int end , int target){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return true;
            }
        }

        return false;
    }

}