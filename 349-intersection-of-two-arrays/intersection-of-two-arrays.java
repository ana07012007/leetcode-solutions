class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        list = removeduplicate(nums1);

        ArrayList<Integer> anslist = new ArrayList<>();
        Arrays.sort(nums2);

        for(int i =0; i< list.size() ;i++ ){
            int num = binarysearch(nums2, list.get(i));
            if(num!=-1){
                anslist.add(num);
            }
        }
        int[] ans = new int[anslist.size()];
        for(int i =0; i<anslist.size() ; i++){
            ans[i] = anslist.get(i);
        }

        return ans;
        
    }

    static ArrayList<Integer> removeduplicate(int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i< arr.length-1 ; i++ ){
            if(arr[i] != arr[i+1]){
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length-1]);

        return list;
    }

    static int binarysearch(int[] arr , int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                return arr[mid];
            }
        }

        return -1;
    }

    
    
}