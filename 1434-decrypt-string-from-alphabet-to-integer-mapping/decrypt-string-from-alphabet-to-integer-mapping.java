class Solution {
    public String freqAlphabets(String s) {
        StringBuilder builder = new StringBuilder();

        int i = s.length()-1; 
        while(i>=0){
            if(s.charAt(i) != '#'){
                builder.insert(0 , (char)(s.charAt(i) + '0'));
                i--;
            }
            else{

                int num = ((s.charAt(i-2) -'0')*10) + (s.charAt(i-1) -'0') ;
                builder.insert(0 , (char)('a' + num -1));
                i-=3;
            }
        }

        return builder.toString();
    }
}