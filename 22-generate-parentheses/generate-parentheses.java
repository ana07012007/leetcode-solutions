class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();

        generateans(ans , n , "" , 0 , 0);

        return ans;
    }

    public void generateans(List<String> ans , int n , String s , int open , int close){
        if(open == n && close == n){
            ans.add(s);
            return;
        }

        if(open < n)generateans(ans , n , s + '(' , open + 1 , close);
        if(open > close)generateans(ans , n , s + ')' , open , close + 1);


    }
}