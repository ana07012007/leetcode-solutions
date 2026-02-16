class Solution {
    public int firstMissingPositive(int[] nums) {
        int i =0;
        while(i< nums.length){
            int correct = nums[i] -1;
            if(nums[i] > 0 && correct < nums.length){
                if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }else{
                    i++;
                }
            }else{
                i++;
            }

        }

        // for(int j =0; j< nums.length ;j++){
        //     if(nums[j] != j+1){
        //         return j+1;
        //     }
        // }

        int j =0;
        while(j<nums.length){
            if(nums[j] != j+1){
                return j+1;
            }else{
                j++;
            }
        }
        return j+1;
    }
}