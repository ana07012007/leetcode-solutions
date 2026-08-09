class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prev = 0;

        for(char c : s.toCharArray()){
            if(c == 'I'){
                ans += 1;
                prev = 1;
            }else if(c == 'V'){
                if(prev == 1){
                    ans += 3;
                    prev = 5;
                }else{
                    ans += 5;
                    prev = 5;
                }
            }else if(c == 'X'){
                if(prev  == 1){
                    ans += 8;
                    prev = 10;
                }else {
                    ans += 10;
                    prev = 10;
                }
            }else if(c == 'L'){
                if(prev == 10){
                    ans += 30;
                    prev = 50;
                }else{
                    ans += 50;
                    prev = 50;
                }
            }else if(c == 'C'){
                if(prev == 10){
                    ans += 80;
                    prev = 100;
                }else{
                    ans += 100;
                    prev = 100;
                }
            }else if(c == 'D'){
                if(prev == 100){
                    ans += 300;
                    prev = 500;
                }else{
                    ans += 500;
                    prev = 500;
                }
            }else if(c == 'M'){
                if(prev == 100){
                    ans += 800;
                    prev = 1000;
                }else{
                    ans += 1000;
                    prev = 1000;
                }
            }
        }

        return ans;
        
    }
}