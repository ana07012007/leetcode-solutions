class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums){
            list.add(n);
        }

        int p = Collections.binarySearch(list , target);

        if(p >= 0){
            return p;
        }
        else{
            return Math.abs(p) -1;
        }
        
    }
}