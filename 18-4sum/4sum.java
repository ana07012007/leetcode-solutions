class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-3 ; i++){
            for(int j = i+1 ; j < nums.length-2 ; j++){
                int start = j + 1;
                int end = nums.length - 1;

                while( start < end){
                    long sum = nums[start] + nums[end];
                    sum += nums[i] + nums[j];
                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[start], nums[end]);

                        ans.add(temp);
                        start++;
                        end--;
                    }else if(sum < target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
}