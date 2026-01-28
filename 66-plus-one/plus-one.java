class Solution {
    public int[] plusOne(int[] digits) {
        //ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[digits.length+1];
        for(int i = digits.length-1 ; i >= 0 ; i--){
            digits[i]++;
            if(digits[i]==10){
                digits[i] = 0;
                
            }
            else{
                //digits[i]++;
                return digits;
            }
        }
        arr[0] = 1;
        return arr;

    }
}