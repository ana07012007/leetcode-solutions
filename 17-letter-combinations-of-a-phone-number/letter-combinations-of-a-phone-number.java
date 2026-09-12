class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");
        List<String> ans = new ArrayList<>();
        return solve(digits , ans , map , "" , 0);

    }

    public List<String> solve(String s ,List<String> ans , HashMap<Character , String> map , String curr, int index){

        
        if(s.length() == index){
            ans.add(new String(curr));
            return ans;
        }

        
        String st = map.get(s.charAt(index));
        for(char c : st.toCharArray()){
            ans = solve(s , ans , map , curr + c , index + 1);
        }
        

        return ans;
    }
}