class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        int i = 0;
        while(i < intervals.length){
            int start = intervals[i][0];
            int end = intervals[i][1];

            while(i+1 < intervals.length && end >= intervals[i+1][0]){
                i++;
                if(end < intervals[i][1])end = intervals[i][1];
            }

            
            list.add(new int[]{start, end});
            i++;
            
        }
        int[][] result = list.toArray(new int[list.size()][]);
        return result;
    }
}