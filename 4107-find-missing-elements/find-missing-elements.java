class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            start = Math.min(start , i);
            end = Math.max(end , i);
            set.add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = start ; i <= end ; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}