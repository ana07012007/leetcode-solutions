class Solution {

    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long prime = n / 2;
        long even = n - prime;

        long evenpower = power(5 , even);
        long primepower = power(4 , prime);

        return (int)((evenpower * primepower) % MOD);
    }

    public long power(long x , long n){
        if(n == 0)return 1;

        long half = power(x , n / 2);

        if(n % 2 == 0){
            return (half * half) % MOD;
        }

        return ((half * half) % MOD * x) % MOD ;
    }
}