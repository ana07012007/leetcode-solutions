class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];

        for(int i =0 ; i< arr.length ; i++){
            StringBuilder str = new StringBuilder(arr[i]);
            int digit = str.charAt(str.length()-1) -'0';
            str.deleteCharAt(str.length()-1);
            ans[digit-1] = str.toString();

        }

        return String.join(" ",ans);
    }
}