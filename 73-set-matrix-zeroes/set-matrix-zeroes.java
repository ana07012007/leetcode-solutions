class Solution {
    public void setZeroes(int[][] matrix) {
        int temp = 0;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    if(j == 0){
                        temp = -10;
                        matrix[i][0] = -10;
                    }else{
                        matrix[0][j] = -10;
                        matrix[i][0] = -10;
                    }
                }
            }
        }

        for(int i = 1; i < matrix.length ; i++){
            for(int j = 1 ; j < matrix[0].length ; j++){
                if(matrix[0][j] == -10 || matrix[i][0] == -10)matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == -10){
            for(int j = 0 ; j < matrix[0].length ; j++){
                matrix[0][j] = 0;
            }
        }else{
            for(int j = 1 ; j < matrix[0].length ; j++){
                if(matrix[0][j] == -10)matrix[0][j] = 0;
            }
        }

        if(temp == -10){
            for(int i = 0 ; i < matrix.length ; i++){
                matrix[i][0] = 0;
            }
        }
        else{
            for(int i = 0 ; i < matrix.length ; i++){
                if(matrix[i][0] == -10){
                    matrix[i][0] = 0;
                }
            }
        }

    }
}