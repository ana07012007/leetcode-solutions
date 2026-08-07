class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();

        int right = num.length()- 1;
        
        while(right >= 0 && ((int)(num.charAt(right) - '0')) % 2 != 1){
           right--;
        }
        for(int i = 0 ; i <= right ; i++){
            sb.append(num.charAt(i));
        }

        return sb.toString();
    }
}