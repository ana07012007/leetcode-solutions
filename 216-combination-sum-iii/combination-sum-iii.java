class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        return solve(k , n , 0 , 0 , ans , temp , 1);
    }

    public List<List<Integer>> solve(int k , int n , int count , int sum , List<List<Integer>> ans , List<Integer> curr , int num){

        if(count == k){
            if(sum == n){
                ans.add(new ArrayList<>(curr));
            }
            return ans;
        }

        for(int i = num ; i <= 9 ; i++){
            curr.add(i);
            ans = solve(k , n , count + 1 , sum + i , ans , curr , i + 1);
            curr.remove(curr.size() - 1);
        }

        return ans;
    }
}