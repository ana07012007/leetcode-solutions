class Solution {
    public int beautySum(String s) {
       int ans = 0;

       for(int i = 0 ; i < s.length() - 1 ; i++){
        int j = i + 1;
        while(j < s.length() && !valid(s,i , j)){
            j++;
        }
        while(j < s.length()){
            ans += beauty(s, i , j++);
        }
       }
        return ans;
    }

    public boolean valid(String s , int i , int j){
        int[] arr = new int[26];

        for(int start = i ; start <= j ; start++){
            arr[s.charAt(start) - 'a']++;
            int count = 0;
            for(int k = 0; k < 26; k++){
                if(arr[k] >= 1)count++;
                if(count == 2)return true;
            }
        }

        return false;
    }

    public int beauty(String s , int i , int j){
        int[] arr = new int[26];
        for(int k = i ; k <= j ; k++){
            arr[s.charAt(k) - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int k = 0 ; k < 26 ; k++){
            if(arr[k] > 0){
                min = Math.min(min , arr[k]);
                max = Math.max(max , arr[k]);
            }
        }

        return max - min;
    }
}