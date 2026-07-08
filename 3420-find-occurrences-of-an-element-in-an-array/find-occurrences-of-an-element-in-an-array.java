class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int occur = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == x){
                map.put(occur , i);
                occur++;
            }
        }
        int[] ans = new int[queries.length];

        for(int i = 0 ; i < queries.length ; i++){
            if(map.containsKey(queries[i])){
                ans[i] = map.get(queries[i]);
            }else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}