class Solution {
    public int smallestNumber(int n, int t) {
        int p = 1;
        int a = n;
        while(a > 0){
            p *= a % 10;
            a /= 10;
        }

        if(p % t == 0)return n;
        else return smallestNumber(n + 1 , t);
    }
}