class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int length = nums.length /3;

        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0)+1);
        }

        for(Integer n : map.keySet()){
            if(map.get(n) > length){
                list.add(n);
            }
        }
        return list;
    }
}