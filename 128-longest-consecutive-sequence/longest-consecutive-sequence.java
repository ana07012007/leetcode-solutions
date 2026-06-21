class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        for(int num: map.keySet()){
            int prev = num - 1;
            if(!map.containsKey(prev)){
                int next = num + 1;
                int count = 1;

                while(map.containsKey(next)){
                    next++;
                    count++;
                }
                max = Math.max(max , count);
            }
            
        }

        return max;

    }
}