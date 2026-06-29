class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        for(int i = 0 ;i <= rowIndex ; i++){
            list.add((int)ans);
            ans *= (rowIndex - i);
            ans /= i+1;
        }

        return list;
    }
}