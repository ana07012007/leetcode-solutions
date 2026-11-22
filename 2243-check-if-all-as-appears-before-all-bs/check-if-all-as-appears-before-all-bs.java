class Solution {
    public boolean checkString(String s) {
        boolean temp = false;
        for(char c : s.toCharArray()){
            if(c == 'b')temp = true;
            if(temp && c == 'a')return false; 
        }

        return true;
    }
}