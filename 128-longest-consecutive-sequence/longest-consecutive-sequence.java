class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        int ans = 0;
        for(int num : map.keySet()){
            int prev = num-1;
            if(!map.containsKey(prev)){
                int count = 1;
                int next = num + 1;
                while(map.containsKey(next)){
                    count++;
                    next++;
                }
                ans = Math.max(ans , count);
            }
        }

        return ans;
    }
}