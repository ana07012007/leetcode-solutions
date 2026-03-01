class Solution {
    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();

        

        for(int i =0; i<command.length() ; i++){
            if(command.charAt(i) == 'G'){
                builder.append("G");
            }else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                builder.append("o");
            }else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
                builder.append("al");
            }
        }

        return builder.toString();
    }
}