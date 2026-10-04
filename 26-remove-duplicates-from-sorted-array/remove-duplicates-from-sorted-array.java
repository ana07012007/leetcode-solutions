class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int curr = 0;
        int ans =0;
        while(curr != nums.length){
            if(curr == nums.length - 1 || nums[curr] != nums[curr + 1]){nums[index++] = nums[curr];
            ans++;
            }
            curr++;
        }
        return ans;

    }
}