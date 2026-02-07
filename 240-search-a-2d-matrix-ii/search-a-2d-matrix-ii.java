class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length;

        int cstart = arr[0].length-1;
        int rstart =0;
        
        while(cstart >=0 && rstart < row){
            if(arr[rstart][cstart] == target){
                return true;
            }
            else if(arr[rstart][cstart] < target){
                rstart++;
            }else{
                cstart--;
            }
        }

        return false;
    }
}