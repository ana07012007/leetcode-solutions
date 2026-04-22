class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        int[] arr = new int[26];
        for(int i = 0; i < allowed.length() ; i++){
            arr[allowed.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < words.length ; i++){
            String s = words[i];
            for(int j = 0 ; j < s.length() ; j++){
                if(arr[s.charAt(j) - 'a'] == 0){
                    break;
                }
                else if(j == s.length() - 1){
                    ans++;
                }
            }
        }

        return ans;
    }
}