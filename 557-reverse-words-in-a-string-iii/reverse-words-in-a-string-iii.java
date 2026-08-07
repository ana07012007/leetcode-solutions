class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int start = 0;
        while(start < s.length()){
            int low = start;
            while(start < s.length() && s.charAt(start) != ' '){
                start++;
            }
            int high = start -1;
            for(int i = high ; i >= low ; i--){
                sb.append(s.charAt(i));
            }
            while(start < s.length() && s.charAt(start) == ' '){
                start++;
                sb.append(' ');
            }
        }

        return sb.toString();
    }
}