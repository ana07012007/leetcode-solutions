class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    int top = i;
                    while(top >= 0){
                        if(matrix[top][j] != 0){
                            matrix[top][j] = -10;
                        }
                        top--;
                    }
                    int bottom = i;

                    while(bottom < matrix.length){
                        if(matrix[bottom][j] != 0)matrix[bottom][j] = -10;
                        bottom++;
                    }

                    int left = j;

                    while(left >= 0){
                        if(matrix[i][left] != 0)matrix[i][left] = -10;
                        left--;
                    }

                    int right = j;
                    while(right < matrix[0].length){
                        if(matrix[i][right] != 0)matrix[i][right] = -10;
                        right++;
                    }

                }
            }
        }

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == -10)matrix[i][j] = 0;
            }
        }
    }
}