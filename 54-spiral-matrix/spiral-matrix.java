class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int rs = 0;
        int re = matrix.length-1;
        int cs = 0;
        int ce = matrix[0].length-1;
        

        while(rs <= re && cs <= ce){
           for(int j = cs; j <= ce ; j++){
                list.add(matrix[rs][j]);
            }
            rs++;
            
            for(int i = rs ; i <= re ; i++){
                list.add(matrix[i][ce]);
                
            }
            ce--;
           
            if(rs<=re){
            for(int j = ce ; j >= cs; j--){
                list.add(matrix[re][j]);
            }
            re--;
            }
            
            if(cs <= ce){
            for(int i = re; i >= rs ; i--){
                list.add(matrix[i][cs]);
            }
            cs++;
            }
            

        }

        return list;
    }
}