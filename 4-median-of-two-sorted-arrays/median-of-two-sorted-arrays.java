class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int i1 = 0;
        int i2 = 0;
        int k = 0;
        while(i1 < nums1.length && i2 < nums2.length){
            if(nums1[i1] <= nums2[i2])temp[k++] = nums1[i1++];
            else temp[k++] = nums2[i2++];
        }
        while(i1 < nums1.length)temp[k++] = nums1[i1++];
        while(i2 < nums2.length)temp[k++] = nums2[i2++];

        if(temp.length % 2 == 1){
            return (double) temp[temp.length/2];
        }
        else{
            double ans = (double) (temp[temp.length /2] + temp[(temp.length - 1)/2])/2;
            return ans;
        }
    }
}