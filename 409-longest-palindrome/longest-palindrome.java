class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        int[] freq = new int[58];
        for(char c : s.toCharArray()){
            freq[c - 'A']++;
            
        }
        boolean taken = false;
        for(int num : freq){
            ans += num - (num % 2);
            if(!taken && num % 2 == 1){
                ans++;
               taken = true;
            }
        }

        return ans;
    }
}