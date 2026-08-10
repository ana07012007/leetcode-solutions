class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 1)return s;
        String ans = String.valueOf(s.charAt(0));
        int max = 1;

        for(int i = 0; i < s.length() -1; i++){
            for(int j = i + 1; j < s.length(); j++){
                if(valid(s , i , j)){
                    if(j - i + 1 > max){
                        max = j - i + 1;
                        ans = s.substring(i , j + 1);
                    }
                }
            }
        }

        return ans;
    }

    public boolean valid(String s , int i , int j){
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--))return false;
        }

        return true;
    }
}