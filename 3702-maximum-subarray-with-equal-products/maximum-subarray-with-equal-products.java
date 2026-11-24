class Solution {
    public int maxLength(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length -1 ; i++){
            int p = nums[i];
            int l = nums[i];
            int g = nums[i];
            for(int j = i + 1 ; j < nums.length ; j++){
                p *= nums[j];
                l = lcm(l , nums[j]);
                g = gcd(g , nums[j]);

                if(p == l * g){
                    if(j - i + 1 > ans)ans = j - i + 1;
                }
            }
        }

        return ans;
    }

    public int lcm(int a , int b){
        int ans = (a * b)/gcd(a , b);
        return ans;
   }

   public int gcd(int a , int b){
        if(a == 0)return b;
        if(b == 0)return a;

        if(a > b)return gcd(a % b , b);
        else return gcd(b % a , a);
   }
}