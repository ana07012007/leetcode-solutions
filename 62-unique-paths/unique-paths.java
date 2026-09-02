class Solution {
    public int uniquePaths(int m, int n) {
        int[][] ans = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i - 1 < 0 || j - 1 < 0){
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = ans[i-1][j] + ans[i][j-1];
                }
            }
        }
        return ans[m-1][n-1];
    }
}