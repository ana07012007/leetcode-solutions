class Solution {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        int count = 0;
        int ans = 0;
        while(count <= n){
            ans += first;
            count++;
            first = second;
            second = ans;
        }
        return ans;
    }
}





