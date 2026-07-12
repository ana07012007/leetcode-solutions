class Solution {
    public int findMin(int[] nums) {
        int ans = nums[0];
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end- start)/2;
            if(mid + 1 < nums.length && nums[mid] > nums[mid+1])ans = Math.min(ans , nums[mid+1]);
            if(nums[start] < nums[mid]){
                ans = Math.min(ans , nums[start]);
                start = mid;}
            else if(nums[end] > nums[mid])end = mid;
            else if(start + 1 < nums.length && nums[start] == nums[start+1])start++;
            else end--;
        }
        return ans;
    }
}