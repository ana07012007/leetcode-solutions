class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isLowerCase(s.charAt(i))){
                result.append(s.charAt(i));
            } 
            else if(result.length() != 0)
            {if(s.charAt(i) == '*'){
                result.delete(result.length()-1 , result.length());
            }
            else if(s.charAt(i) == '#'){
                result.append(result);
            }
            else if(s.charAt(i) == '%'){
                result.reverse();
            }}
        }

        return result.toString();

    }
}