class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    

    public void mergeSort(int[] arr, int low_4, int high_4) {

        if (low_4 >= high_4) {
            return;
        }

        int mid_4 = low_4 + (high_4 - low_4) / 2;

   
        mergeSort(arr, low_4, mid_4);

      
        mergeSort(arr, mid_4 + 1, high_4);

        
        merge(arr, low_4, mid_4, high_4);
    }

    public void merge(int[] arr, int low_4, int mid_4, int high_4) {

        int[] temp = new int[high_4 - low_4 + 1];

        int i = low_4;       
        int j = mid_4 + 1;  
        int k = 0;       

        while (i <= mid_4 && j <= high_4) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        
        while (i <= mid_4) {
            temp[k] = arr[i];
            i++;
            k++;
        }

       
        while (j <= high_4) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        
        for (int x = 0; x < temp.length; x++) {
            arr[low_4 + x] = temp[x];
        }
    }

}