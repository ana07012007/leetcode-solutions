class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i = left ; i <= right ; i++){
            int bits = count(i);
            if(isprime(bits)){
                ans++;
            }
        }
        return ans;
    }
    static int count(int n){
        int ans = 0;
        while(n > 0){
            n = n & (n-1);
            ans++;
        }
        return ans;
    }

    static boolean isprime(int n){
        if(n < 2){
            return false;
        }
        int i = 2;
        while(i * i <= n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}