class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
    
        Arrays.sort(candidates);

        return solve(candidates , target , ans , temp , 0 , 0 );

    }

    public List<List<Integer>> solve(int[] arr , int target , List<List<Integer>> ans , List<Integer> curr , int sum , int index){
        if(sum == target){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        else if(sum > target){
            return ans;
        }

        for(int i = index ; i < arr.length ;i++){
            if(i > index && arr[i] == arr[i-1])continue;
            curr.add(arr[i]);
            ans = solve(arr , target , ans , curr , sum + arr[i] , i + 1);
            curr.remove(curr.size() - 1);
        }
        return ans;
    }
}