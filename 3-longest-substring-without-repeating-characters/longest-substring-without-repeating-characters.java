class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int len =0;
        int max = 0;
        for(int i = 0; i < s.length() ; i++){
            char[] arr = new char[256];
            for(int j = i ; j < s.length() ; j++){
                if(arr[s.charAt(j)] == 1) break;
                len = j - i + 1;
                max = Math.max(max, len);
                arr[s.charAt(j)] = 1;
            }
        }

        return max;
    }
}