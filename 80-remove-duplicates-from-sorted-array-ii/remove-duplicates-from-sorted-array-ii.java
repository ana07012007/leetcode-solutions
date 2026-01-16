class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 1;
        int count =0;
        for(int i =0; i<nums.length -1 ; i++) {
           
            if(nums[i] == nums[i+1]){
                count++;
            }
            else{
                count =0;
            }


            if(count < 2){
                nums[ans-1]= nums[i];
                ans ++;
                
            }
            
      }
      nums[ans-1] =nums[nums.length -1];

      return ans ;
    }
}