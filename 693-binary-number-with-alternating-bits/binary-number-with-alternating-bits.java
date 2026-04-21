class Solution {
    public boolean hasAlternatingBits(int n) {
       if(n % 2 == 0){
        while(n > 0){
            if((n & 1) != 0){
                return false;
            }
            n >>= 1;
            if(n > 0 && (n & 1) != 1){
                return false;
            }
            n >>= 1;
        }
       } 
       else{
        while(n > 0){
            if((n & 1) != 1){
                return false;
            }
            n >>= 1;
            if(n > 0 && (n & 1) != 0){
                return false;
            }
            n >>= 1;
        }
       }
       return true;
    }
}