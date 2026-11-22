class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            double temp = power(x ,-1* (long)(n));
            return 1/temp;
        }
        else{ return power(x , n);}
    }

    public double power(double x, long n){
        if(n == 0)return 1;
        if(n == 1)return x;
        if(n % 2 == 1)return power(x * x , n / 2)  * x;
        else return power(x * x , n/2);
    }
}