class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int n : nums){
            if(c1 == 0 && el2 != n){
                el1 = n;
                c1 = 1;
            }
            else if(c2 == 0 && el1 != n){
                el2 = n;
                c2 = 1;
            }
            else if(n == el1){
                c1++;
            }
            else if(n == el2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        int count1 = 0;
        int count2 = 0;

        for(int n : nums){
            if(el1 == n)count1++;
            if(el2 == n)count2++;
        }

        List<Integer> list = new ArrayList<>();

        if(count1 > nums.length/3)list.add(el1);
        if(count2 > nums.length/3)list.add(el2);

        return list;

    }
}