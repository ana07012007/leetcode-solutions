class Solution {
    public boolean exist(char[][] board, String word) {
        HashSet<String> set = new HashSet<>();

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){set.add(i + "," + j);
                if(solve(board , word , set , i , j , 1 , false))return true;
                set.remove(i + "," + j);}
            }
        }
        return false;

    }

    public boolean solve(char[][] mat , String s ,HashSet<String> set , int i , int j , int index , boolean ans){
        if(index == s.length()){
            ans = true;
            return ans;
        }
        if(ans)return ans;

        if(i - 1 >= 0 && !set.contains((i - 1) + "," + j) && s.charAt(index) == mat[i - 1][j]){

            set.add((i - 1) + "," + j);
            ans = solve(mat , s , set , i-1 , j , index + 1 ,ans);
            set.remove((i - 1) + "," + j);
        }
        if(i + 1 < mat.length && !set.contains((i + 1) + "," + j) && s.charAt(index) == mat[i+ 1][j]){
            set.add((i + 1) + "," + j);
            ans = solve(mat , s , set , i+ 1 , j , index + 1 ,ans);
            set.remove((i + 1) + "," + j);
        }
        if(j - 1 >= 0 && !set.contains(i + "," + (j - 1)) && s.charAt(index) == mat[i][j -1]){
            set.add(i + "," + (j - 1));
            ans = solve(mat , s , set , i , j -1 , index + 1 ,ans);
            set.remove(i + "," + (j - 1));
        }
        if(j + 1 < mat[0].length && !set.contains(i + "," + (j + 1)) && s.charAt(index) == mat[i][j + 1]){
            set.add(i + "," + (j + 1));
            ans = solve(mat , s , set , i , j + 1, index + 1 ,ans);
            set.remove(i + "," + (j + 1));
        }

        return ans;
    }
}