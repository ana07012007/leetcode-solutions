class Solution {
    public boolean exist(char[][] board, String word) {
       for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    char temp = board[i][j];
                    board[i][j] = '.';
                    if(solve(board , word , i , j , 1 ))return true;
                    board[i][j] = temp;
                }
            }
        }
        return false;

    }

    public boolean solve(char[][] mat , String s, int i , int j , int index ){
        if(index == s.length()){
            return true;
        }
       

        if(i - 1 >= 0 && s.charAt(index) == mat[i - 1][j]){

            char temp = mat[i - 1][j];
            mat[i - 1][j] = '.';
            if(solve(mat , s , i-1 , j , index + 1)) return true;
            mat[i - 1][j] = temp;        
        }
        if(i + 1 < mat.length && s.charAt(index) == mat[i+ 1][j]){
            char temp = mat[i + 1][j];
            mat[i + 1][j] = '.';
            if(solve(mat , s , i+ 1 , j , index + 1))return true;
            mat[i + 1][j] = temp;        
        }
        if(j - 1 >= 0 && s.charAt(index) == mat[i][j -1]){
            char temp = mat[i][j - 1];
            mat[i][j - 1] = '.';
            if(solve(mat , s , i , j -1 , index + 1)) return true;
            mat[i][j - 1] = temp;
        }
        if(j + 1 < mat[0].length && s.charAt(index) == mat[i][j + 1]){
            char temp = mat[i][j + 1];
            mat[i][j + 1] = '.';
            if(solve(mat , s , i , j + 1, index + 1)) return true;
            mat[i][j + 1] = temp;
        }

        return false;
    }
}