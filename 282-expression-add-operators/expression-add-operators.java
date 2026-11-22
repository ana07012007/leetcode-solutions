class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();

        solve(num , target , ans , "" , 0 , 0 , 0);

        return ans;
    }

    public List<String> solve(String num , int target , List<String> ans , String s , int i , long last  , long temp){
        if(i == num.length()){
            if(temp == target)ans.add(s);
            return ans;
        }

        for(int j = i ; j < num.length() ; j++){
            if(j > i && num.charAt(i) == '0')break;

            String str = num.substring(i , j+1);
            long curr = Long.parseLong(str);

            if(i == 0){
                solve(num , target , ans , s + str , j + 1 ,curr , curr);
            }else{
                solve(num , target , ans , s + '+' + str , j + 1 ,curr , temp + curr);
                solve(num , target , ans , s + '-' + str , j + 1 , -1 * curr , temp - curr);

                solve(num , target , ans , s + '*' + str , j + 1 ,last * curr, temp - last + last * curr);
            }
        }
        
        
        return ans;
    }
}