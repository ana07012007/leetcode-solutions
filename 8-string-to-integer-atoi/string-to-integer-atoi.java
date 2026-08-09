class Solution {
    public int myAtoi(String s) {
        if(s.length()== 0)return 0;
        long ans = 0;
        int i = 0;
        int sign = 1;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-')sign = -1;
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            ans = (ans * 10)+ digit;
            if(sign == 1 && ans > Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(sign == -1 && sign * ans < Integer.MIN_VALUE)return Integer.MIN_VALUE;
            i++;
        }

        
        
        return (int)(ans * sign);
    }
}