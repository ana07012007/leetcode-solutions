class Solution {
    public void rotate(int[][] matrix) {
        for(int i =0; i< matrix.length ; i++){
            for(int j = i+1 ; j<matrix[i].length ; j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
        }
        int i = 0;
        int j = matrix.length-1;
        
        while(i<=j){
            for(int rs = 0; rs<matrix.length ; rs++){
                int temp = matrix[rs][i];
                matrix[rs][i] = matrix[rs][j];
                matrix[rs][j] = temp;
            }
            i++;
            j--;
        }
    }
}