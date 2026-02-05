class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i =0; i< nums1.length ; i++){
            int count = 0;
            for(int j = 0 ; j< nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    nums2[j]=Integer.MIN_VALUE;
                    count++;
                }

                if(count==1){
                    list.add(nums1[i]);
                    count++;
                }
            }
        }

        int[] ans  = new int[list.size()];

        for(int i =0 ; i< list.size() ; i++){
            ans[i]= list.get(i);
        }

        return ans;
    }
}