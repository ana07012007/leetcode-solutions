class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] arr = new int[n][n];
        int rs =0;
        int re = n-1;
        int cs =0;
        int ce = n-1;
        while(num <= n*n){
            for(int i = cs; i<=ce ; i++){
                arr[rs][i] = num;
                num++;
            }
            rs++;

            for(int i = rs ; i<=re ; i++){
                arr[i][ce] = num;
                num++;
            }
            ce--;
            if(rs<re){
                for(int i = ce ; i>= cs ; i--){
                    arr[re][i] = num;
                    num++;
                }
                re--;
            }
            
            if(cs<ce){
                for(int i = re ; i>=rs ; i--){
                    arr[i][cs] = num;
                    num++;
                }
                cs++;
            }
            

            
        }

        return arr;
    }
}