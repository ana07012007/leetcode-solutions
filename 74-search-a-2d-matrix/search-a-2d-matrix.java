class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int low = 0 ;
        int high = mat.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mat[mid][0] < target){
                low = mid+1;
            }
            else if(mat[mid][0] > target){
                high = mid - 1;
            }else{
                return true;
            }
        }
        if(high < 0)return false;

        int left = 0 ;
        int right = mat[high].length - 1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(mat[high][mid] < target){
                left = mid + 1;
            }
            else if(mat[high][mid] > target){
                right = mid - 1;
            }
            else{
                return true;
            }
        }

        return false;
    }
}