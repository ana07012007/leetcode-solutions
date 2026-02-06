class Solution {
    public int absDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        int start =0; 
        int end = nums.length -1;
        int sum1 =0;
        int sum2=0;
        int count =0;
        while(count<k ){
            sum1+=nums[start];
            sum2+=nums[end];
            start++;
            end--;
            count++;
        }
        return sum2 - sum1;
    }
}