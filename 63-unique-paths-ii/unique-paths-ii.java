class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0] == 1)return 0;
        grid[0][0] = 1;
       

        for(int i = 1 ; i < grid.length ; i++){
            int fill = grid[i][0] == 1 ? 0 : grid[i-1][0];
            grid[i][0] = fill;
        }

        for(int i = 1 ; i < grid[0].length ; i++){
            int fill = grid[0][i] == 1 ? 0 : grid[0][i -1];
            grid[0][i] = fill;
        }


        for(int i = 1 ; i < grid.length ; i++){
            for(int j = 1 ; j < grid[i].length ; j++){
                int fill = grid[i][j] == 1 ? 0 : grid[i - 1][j] + grid[i][j -1];
                grid[i][j] = fill;
            }
        }

        return grid[grid.length -1 ][grid[0].length -1];
    }
}