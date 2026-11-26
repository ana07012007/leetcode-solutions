class Solution {
    public boolean canAliceWin(int n) {
        int num = 10;
        boolean ans = false;
        while(n > 0){
            if(n >= num){
                n -= num;
                if(ans)ans = false;
                else ans = true;
            }else{
                return ans;
            }
            num--;
            if(num == 0)return ans;

        }

        return ans;
    }
}