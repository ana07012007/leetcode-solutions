class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ;i <= rowIndex ; i++){
            int num =(int) com(rowIndex , i);
            list.add(num);
        }

        return list;
    }

    static long com(int row , int col){
        long ans = 1;
        for(int i = 0 ; i < col ; i++){
            ans *= row - i;
            ans /= i+1;
        }

        return ans;
    }
}