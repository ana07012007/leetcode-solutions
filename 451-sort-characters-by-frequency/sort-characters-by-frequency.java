class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[128];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
       
        for(int i = 0 ; i < s.length();i++){
            int max = 0;
            int index = 0;
            for(int j = 0 ; j < 128 ; j++){
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = 0;
            if(max == 0)break;

            while(max-- > 0){
                sb.append((char)(index)); 
            }
        }
        return sb.toString();
    }
}