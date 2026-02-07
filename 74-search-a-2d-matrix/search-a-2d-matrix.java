class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        if(row==1){
            return binarysearch(matrix , 0, 0 , col-1 ,target );
        }
        int rs = 0;
        int re = row-1;
        int cmid = col/2;

        while(rs<re-1){
            int rmid = rs+ (re-rs)/2;

            if(matrix[rmid][cmid] == target){
                return true;
            }

            if(matrix[rmid][cmid] < target){
                rs = rmid;
            }else{
                re = rmid;
            }
        }

        if(matrix[rs][cmid]==target){
            return true;
        }

        if(matrix[re][cmid] == target){
            return true;
        }


        if(target >= matrix[rs][0] &&cmid-1>=0 && target <= matrix[rs][cmid-1]){
            return binarysearch(matrix, rs, 0 ,cmid-1 , target);
        }
        else if(cmid+1<col && target >= matrix[rs][cmid+1]&& target <= matrix[rs][col - 1]){
            return binarysearch(matrix, rs, cmid+1 ,col-1 , target);
        }
        else if(target >= matrix[re][0] && cmid-1>=0 && target <= matrix[re][cmid-1]){
            return binarysearch(matrix, re, 0 ,cmid-1 , target);
        }
         else if(cmid+1<col && target >= matrix[re][cmid+1]){
            return binarysearch(matrix, re, cmid+1 ,col-1 , target);
        }
        return false;
    }

    static boolean binarysearch(int[][] arr ,int row , int start , int end, int target){

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[row][mid] == target){
                return true;
            }
            else if(arr[row ][mid] <target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return false;
    }
}