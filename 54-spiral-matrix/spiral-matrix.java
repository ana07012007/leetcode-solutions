class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int rs =0;
        int re = mat.length -1;
        int cs =0;
        int ce = mat[0].length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(rs<=re && cs<=ce){

            for(int index = cs ; index <= ce ; index++){
                list.add(mat[rs][index]);
            }
            rs++;
            
            for(int index = rs ; index <= re ; index++){
                list.add(mat[index][ce]);
            }
            ce--;
            if(rs<=re){
                for(int index = ce ; index >= cs ; index--){
                list.add(mat[re][index]); 
            }
            re--;
            }
            
            
            if(cs<=ce){
                
            for(int index = re ; index >= rs ; index--){
                list.add(mat[index][cs]);
            }
            cs++;
            }
            
        }

        return list;
    }


}