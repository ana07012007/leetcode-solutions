class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character , Integer> map = new HashMap<>();

       for(char c : s.toCharArray()){
        map.put(c , map.getOrDefault(c , 0)+1);
       } 

       boolean taken = false;
       int ans = 0;
       
       for(Integer value : map.values()){
        ans += value - (value %2);
        if(value % 2 != 0 && !taken){
            ans += 1;
            taken = true;
        }
       }

       return ans;
    }
}