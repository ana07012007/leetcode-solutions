class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        int[] freq = new int[58];
        for(char c : s.toCharArray()){
            freq[c - 'A']++;
            if(freq[c - 'A']% 2 == 0){
                ans+=2;
            }
        }
        for(int num : freq){
            if(num % 2 == 1){
                ans++;
                break;
            }
        }

        return ans;
    }
}