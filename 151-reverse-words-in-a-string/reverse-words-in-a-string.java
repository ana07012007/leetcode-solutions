class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split(" ");
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            String temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        String ans = String.join(" ", arr);
        ans = ans.trim().replaceAll("\\s+" , " ");
        //ans = ans.trim();
        
        return ans;
    }
}