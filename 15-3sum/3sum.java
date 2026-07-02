class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            int start = i+1;
            int end = nums.length -1;

            while(start < end){
                if(nums[i] + nums[start] + nums[end] == 0){
                    List<Integer> temp = Arrays.asList(nums[i] , nums[start] , nums[end]);

                    ans.add(temp);
                    start++;
                    end--;
                }
                else if(nums[i] + nums[start] + nums[end] < 0){
                   start++;
                }
                else{
                    end--;
                }
            }
        }

        return new ArrayList<>(ans);
    }
}