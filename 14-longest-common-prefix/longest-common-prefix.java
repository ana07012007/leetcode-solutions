class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder(strs[0]);
        for(String str : strs){
            if(!sb.equals(str)){
                int left = 0;
                StringBuilder temp = new StringBuilder();
                int index = Math.min(sb.length() , str.length());
                while(left < index && sb.charAt(left) == str.charAt(left)){
                    temp.append(sb.charAt(left));
                    left++;
                }
                sb = temp;
            }
        }

        return sb.toString();
    }
}