class Solution {
    public int search(int[] nums, int target) {
        int pivot = searchpivot(nums);

        int ans = binarysearch(nums , 0 , pivot, target);
        if(ans == -1)return binarysearch(nums , pivot + 1 ,nums.length -1 ,target);

        return ans;
    }

    static int searchpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid + 1 < arr.length && arr[mid] > arr[mid + 1])return mid;
            else if(arr[mid] > arr[start])start = mid;
            else end--;
        }

        return start;
    }

    static int binarysearch(int[] arr , int start , int end ,int target){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if( arr[mid] > target){
                end = mid -1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}