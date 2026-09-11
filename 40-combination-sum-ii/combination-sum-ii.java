class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);

        return solve(candidates , target , ans , temp , 0 , 0 , set);

    }

    public List<List<Integer>> solve(int[] arr , int target , List<List<Integer>> ans , List<Integer> curr , int sum , int index , HashSet<List<Integer>> set){
        if(sum == target){
            if(!set.contains(curr)){
                set.add(new ArrayList<>(curr));
                ans.add(new ArrayList<>(curr));
            }
            return ans;
        }
        else if(sum > target){
            return ans;
        }

        for(int i = index ; i < arr.length ;i++){
            if(i > index && arr[i] == arr[i-1])continue;
            curr.add(arr[i]);
            ans = solve(arr , target , ans , curr , sum + arr[i] , i + 1 , set);
            curr.remove(curr.size() - 1);
        }
        return ans;
    }
}