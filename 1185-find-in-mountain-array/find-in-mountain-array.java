/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = peakindex(mountainArr);

        int ans = ascsearch(mountainArr , start , end , target);

        if(ans != -1){
            return ans;
        }
        else{
            start = end;
            end = mountainArr.length() -1;
            ans = dessearch(mountainArr , start , end , target);
        }

        return ans;
    }

    static int peakindex( MountainArray arr){
        int start = 0;
        int end = arr.length() -1 ;

        if(arr.length() > 1){
            while(start <= end){
                int mid = start + (end - start)/2;

                if(arr.get(mid) > arr.get(mid+1)){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return start;
    }


    static int ascsearch( MountainArray arr , int start , int end , int target){
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr.get(mid) < target){
                start = mid+1;
            }
            else if(arr.get(mid) > target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }


    static int dessearch( MountainArray arr , int start , int end , int target){
        
        while(start<= end){
            int mid = start + (end-start)/2;

            if(arr.get(mid) > target){
                start = mid +1;
            }
            else if(arr.get(mid) < target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}