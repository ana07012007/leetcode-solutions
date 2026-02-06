class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        
        for(int i =0; i<intervals.length ; i++){
            ans[i] =Integer.MAX_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < intervals.length ; j++){
                
                    if(intervals[i][1] == intervals[j][0]){
                     ans[i] = j;
                     break;
                    }
                    else if(intervals[i][1] < intervals[j][0]){
                        min = Math.min(intervals[j][0] , min);
                        if(min < ans[i]){
                            ans[i] =j;
                        }
                        
                        
                    }
                

            }
            if(ans[i] == Integer.MAX_VALUE){
                ans[i] = -1;}

            
        }
    

        return ans;
    }
}