class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();
        boolean track = false;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(!track){
                    track = true;
                }else{
                    st.push(c);
                    sb.append(c);
                }
                
            }else{
                if(st.isEmpty()){
                    track = false;
                }else{
                    st.pop();
                    sb.append(c);
                }
            }
            
        }

        
        return sb.toString();
    }
}