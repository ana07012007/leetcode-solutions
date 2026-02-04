class Solution {
    public int[] twoSum(int[] arr, int target) {
        int index = 0;

        while(index < arr.length){
            int col = binarySearch(arr , target , index);
            if(col != -1){
                return new int[]{index+1 , col+1};
            }
            else{
                index++;
            }
        }

        return new int[]{-1,-1};

    }

    static int binarySearch(int[] arr , int target , int index ){
        int start = index +1;
        int end = arr.length-1;

        while(start<= end){
            int mid = start + (end - start)/2;

            if(arr[mid] + arr[index] == target ){
                return mid;
            }else if(arr[mid] + arr[index] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
}