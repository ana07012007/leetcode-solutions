class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
           double ans = power(x , -n);
           return 1/ans;
        }

        return power(x , n);
    }

    public double power(double num , int n){
        if(n == 0)return 1;
        if(n == 1)return num;
        if(n % 2 == 0)return power(num * num , n/2);
        else return num * power(num * num , n/2);
    }
}