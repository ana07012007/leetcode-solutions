class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length)return findMedianSortedArrays(nums2 , nums1);
        int start = 0;
        int end = nums1.length;
        int k = (nums1.length + nums2.length + 1)/2;
        while(start <= end){
            int mid1 = start + (end - start)/2;
            int mid2 = k - mid1;
            int l1 = Integer.MIN_VALUE;
            if(mid1 - 1 >= 0)l1 = nums1[mid1 - 1];
            int l2 = Integer.MIN_VALUE;
            if(mid2 - 1 >= 0)l2 = nums2[mid2 - 1];
            int r1 = Integer.MAX_VALUE;
            if(mid1 < nums1.length)r1 = nums1[mid1];
            int r2 = Integer.MAX_VALUE;
            if(mid2 < nums2.length)r2 = nums2[mid2];
            if(l1 <= r2 && l2 <= r1){
                if((nums1.length + nums2.length) % 2 == 1)return Math.max(l1 , l2);
                return (double)(Math.max(l1 , l2) + Math.min(r1 , r2))/2.0;
            }else if(l1 > r2){
                end = mid1 - 1;
            }
            else{
                start = mid1 + 1;
            }
            
        }

        return 0;
    }
}