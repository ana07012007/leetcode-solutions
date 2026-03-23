class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int left = 0;
       int right = 0;
       int max = 0;
       int[] arr = new int[255];

       while(right < s.length()){
            if(arr[s.charAt(right)] == 0){
                arr[s.charAt(right)]++;
                right++;
            }else{
                arr[s.charAt(left)]--;
                left++;
            }
            max = Math.max(max , right-left);
       } 

       return max;
    }
}