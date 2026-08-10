class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        while(i < word.length() && word.charAt(i) != ch){
            i++;
        }
        if(i >= word.length())return word;
        char[] arr = word.toCharArray();

        int start = 0;
        while(start < i){
            char temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }

        return new String(arr);
    }
}