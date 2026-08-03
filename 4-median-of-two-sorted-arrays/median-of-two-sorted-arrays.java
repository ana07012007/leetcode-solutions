class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int k = 0;
        for(int i : nums1){
            temp[k++] = i;
        }
        for(int i : nums2){
            temp[k++] = i;
        }
        Arrays.sort(temp);

        if(temp.length % 2 == 1){
            return (double) temp[temp.length/2];
        }
        else{
            double ans = (double) (temp[temp.length /2] + temp[(temp.length - 1)/2])/2;
            return ans;
        }
    }
}