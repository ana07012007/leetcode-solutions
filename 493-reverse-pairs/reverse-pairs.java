class Solution {
    static int cnt = 0;
    public int reversePairs(int[] nums) {
        cnt = 0;
        mergesort(nums , 0 , nums.length - 1);
        return cnt;
    }
    static void mergesort(int[] nums , int low , int high){
        if(high <= low)return;
        int mid = low + (high - low)/2;

        mergesort(nums , low , mid);
        mergesort(nums , mid+1 , high);
        
        counter(nums , low , mid , high);

        sort(nums , low , mid , high);
    }

    static void counter(int[] nums , int low , int mid , int high){
        int j = mid + 1;
        for(int i = low ; i <= mid ; i++){
            while(j <= high && nums[i] > 2L * nums[j])j++;
            cnt += j - mid - 1;
        }
    }


    static void sort(int[]nums , int low , int mid , int high ){
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid+1;
        int index = 0;

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp[index++] = nums[left++];
            }
            else{
                temp[index++] = nums[right++];
            }
        }


        while(left <= mid)temp[index++] = nums[left++];
        while(right <= high)temp[index++] = nums[right++];
        int i = low;
        for(int value : temp){
            nums[i++] = value;
        }
    }
}