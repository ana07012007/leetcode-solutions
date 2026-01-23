class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        int start = 0;
        int end = 0;

        if(r*c != mat.length * mat[0].length){
            return mat;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (start < mat.length && end < mat[start].length) {
                    arr[i][j] = mat[start][end];
                    end++;
                } else if (start < mat.length-1 && end == mat[start].length) {
                    start++;
                    end = 0;
                    arr[i][j] = mat[start][end];
                    end++;
                }
            }
        }

        return arr;
    }

    
}