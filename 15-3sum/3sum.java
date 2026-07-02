class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        for(int i = 0 ; i < nums.length-1 ; i++){
            HashSet<Integer> temp = new HashSet<>();
            for(int j = i+1 ; j < nums.length ; j++){
                int rem = -(nums[i] + nums[j]);
                if(temp.contains(rem)){
                    List<Integer> list = Arrays.asList(nums[i] , nums[j] , rem);
                    Collections.sort(list);
                    ans.add(list);
                }
                temp.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}