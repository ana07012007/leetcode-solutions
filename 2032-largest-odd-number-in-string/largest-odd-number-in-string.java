class Solution {
    public String largestOddNumber(String num) {
        int right = num.length()- 1;
        
        while(right >= 0 && ((int)(num.charAt(right) - '0')) % 2 != 1){
           right--;
        }
        

        return num.substring(0 , right + 1);
    }
}