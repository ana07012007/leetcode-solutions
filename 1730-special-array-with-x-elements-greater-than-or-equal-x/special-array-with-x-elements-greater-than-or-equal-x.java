class Solution {
    public int specialArray(int[] nums) {

        if(nums.length == 0){
            return 0;
        }


        for(int i =nums.length; i>0 ; i--){
            if(check(nums,i )){
                return i;
            }
        }
        

        return-1;
    }

    static boolean check(int[]arr ,  int target){
        int count =0;
        for(int i =0; i< arr.length ; i++){
            if(arr[i] >= target){
                count++;
            }
        }

        if(count == target){
            return true;
        }

        return false;
    }
}