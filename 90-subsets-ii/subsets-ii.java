class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);

        return solve(nums , ans , temp , 0);
    }

    public List<List<Integer>> solve(int[] arr , List<List<Integer>> ans , List<Integer> curr , int index){
        ans.add(new ArrayList<>(curr));

        for(int i = index ; i < arr.length ; i++){
            if(i > index && arr[i] == arr[i-1])continue;

            curr.add(arr[i]);
            ans = solve(arr , ans , curr , i + 1);
            curr.remove(curr.size() -1);
        }

        return ans;
    }
}