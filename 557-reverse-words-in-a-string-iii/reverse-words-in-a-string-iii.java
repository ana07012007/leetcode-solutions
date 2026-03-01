class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i =0 ; i< words.length ; i++){
            //String word = words[i];
            StringBuilder str = new StringBuilder(words[i]);
            str.reverse();
            words[i] = str.toString();
        }
        

        String ans = String.join(" ", words);

        return ans;
     }
}