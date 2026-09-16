class Solution {
    public List<List<String>> solveNQueens(int n) {
        String[][] board = new String[n][n];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(board[i] , ".");
        }

        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        return solve(n , ans , curr , board , 0);


    }

    public List<List<String>> solve(int n , List<List<String>> ans , List<String> curr , String[][] board , int row){

        if(row == n){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        for(int i = 0 ; i < n ; i++){
            if(can(board , row , i)){
                board[row][i] = "Q";
                String s = String.join("" , board[row]);
                curr.add(s);
                ans = solve(n , ans , curr , board , row + 1);
                curr.remove(curr.size() - 1);
                board[row][i] = ".";
            }
        }

        return ans;
    }

    public boolean can(String[][] board , int i , int j){
        
        for(int index = 0 ; index < i ; index++){
             if(board[index][j] == "Q")return false;
        }

        for(int index = 0 ; index < j ; index++){
             if(board[i][index] == "Q")return false;
        }

        int row = i-1;
        int col = j-1;

        while(row >= 0 && col >= 0){
            if(board[row][col] == "Q")return false;
            row--;
            col--;
        }

        row = i-1;
        col = j+1;

        while(row >= 0 && col < board.length){
            if(board[row][col] == "Q")return false;
            row--;
            col++;
        }

        return true;
    }
}