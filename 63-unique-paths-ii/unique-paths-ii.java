class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0] == 1)return 0;
        int[][] ans = new int[grid.length][grid[0].length];
        ans[0][0] = 1;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] == 1){
                    ans[i][j] = 0;
                }
                else if(i - 1 >= 0 && j - 1 < 0){
                    ans[i][j] = ans[i- 1][j];
                }else if(j - 1 >= 0 && i - 1 < 0){
                    ans[i][j] = ans[i][j -1];
                }else if(i - 1 >= 0 && j - 1 >= 0){
                    ans[i][j] = ans[i -1][j] + ans[i][j -1];
                }
            }
        }

        return ans[grid.length -1 ][grid[0].length -1];
    }
}