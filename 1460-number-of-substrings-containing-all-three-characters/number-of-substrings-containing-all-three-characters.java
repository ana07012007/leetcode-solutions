class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int right = 0;
        int[] a = new int[3];
        if(s.length() < 3)return 0;
        int ans = 0;

        while(left < s.length()- 2 || right < s.length()){
            while(right < s.length() && (a[0] == 0 || a[1] == 0 || a[2] == 0)){
                if(s.charAt(right) == 'a')a[0]++;
                else if(s.charAt(right) == 'b')a[1]++;
                else a[2]++;
                right++;
            }

            if(a[0] > 0 && a[1] > 0 && a[2] > 0){
                ans += s.length() - right + 1;
                char c = s.charAt(left++);
                if(c == 'a')a[0]--;
                else if(c == 'b')a[1]--;
                else a[2]--;
            }else{
                break;
            }

        }

        return ans;
    }
}