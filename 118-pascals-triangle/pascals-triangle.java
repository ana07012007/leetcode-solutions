class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1 ; i <= numRows ; i++){
            list.add(new ArrayList<>());
            long ans = 1;
            for(int j = 1 ; j <= i ; j++){
                list.get(i-1).add((int)ans);
                ans *= i - j;
                ans /= j;
            }
        }

        return list;
    }
}