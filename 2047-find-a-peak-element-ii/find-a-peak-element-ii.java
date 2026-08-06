class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int start = 0;
        int end = mat[0].length;

        while(start <= end){
            int mid = start + (end - start)/2;
            int max = 0;
            for(int i = 0 ; i < mat.length ; i++){
                if(mat[i][mid] > mat[max][mid])max = i;
            }

            if(mid + 1 < mat[0].length && mat[max][mid] < mat[max][mid + 1])start = mid + 1;
            else if(mid - 1 >= 0 && mat[max][mid] < mat[max][mid - 1])end = mid - 1;
            else return new int[]{max , mid};
        }

        return new int[]{-1,-1};
    }
}