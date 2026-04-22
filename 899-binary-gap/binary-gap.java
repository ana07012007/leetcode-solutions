class Solution {
    public int binaryGap(int n) {
        int max = 0;
        while(n > 0){
            int count = 0;
            if((n & 1) == 1){
                n >>= 1;
                count++;
                while(n > 0 && (n & 1) != 1){
                    n >>= 1;
                    count++;
                }
                if((n & 1) == 1 && max < count){
                    max = count;
                }
            }
            else{
                n >>= 1;
            }
        }

        return max;
    }
}