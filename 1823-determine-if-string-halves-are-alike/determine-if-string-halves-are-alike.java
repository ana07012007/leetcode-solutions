class Solution {
    public boolean halvesAreAlike(String s) {
        String str1 = s.substring(0,(s.length()/2));
        String str2 = s.substring(s.length()/2);

        int count1 =0;
        int count2 =0;
        for(int i =0 ; i<str1.length() ; i++){
            if("aeiouAEIOU".indexOf(str1.charAt(i)) != -1){
                count1++;
            }

            if("aeiouAEIOU".indexOf(str2.charAt(i)) != -1){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }else{
            return false;
        }

        
    }
}