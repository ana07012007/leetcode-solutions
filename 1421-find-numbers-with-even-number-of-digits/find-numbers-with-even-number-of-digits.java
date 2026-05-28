class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int n: nums){
            int digit = (int)(Math.log10(n)) + 1;
            if(iseven(digit)){
                ans++;
            }
        }
        return ans;
    }
    static boolean iseven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}