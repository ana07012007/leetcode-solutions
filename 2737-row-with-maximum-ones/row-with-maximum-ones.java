class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int[] ans = new int[2];
        for(int i = 0 ; i < mat.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < mat[i].length ; j++){
                if(mat[i][j] == 1)sum++;
            }
            if(sum > max){
                max = sum;
                ans[0] = i;
                ans[1] = max;
            }
        }

        return ans;
    }
}