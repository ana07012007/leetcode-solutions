class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sarr = new int[128];
        int[] tarr = new int[128];

        if(s.length() != t.length())return false;

        for(int i = 0 ; i < s.length() ; i++){
            if(sarr[s.charAt(i)] == 0){
                sarr[s.charAt(i)] = (t.charAt(i) - 'a') + 1;
            }else if(sarr[s.charAt(i)] != t.charAt(i) - 'a' + 1){
                return false;
            }

            if(tarr[t.charAt(i)] == 0){
                tarr[t.charAt(i)] = (s.charAt(i) - 'a') + 1;
            }else if(tarr[t.charAt(i)] != s.charAt(i) - 'a' + 1){
                return false;
            }
        }

        return true;
    }
}