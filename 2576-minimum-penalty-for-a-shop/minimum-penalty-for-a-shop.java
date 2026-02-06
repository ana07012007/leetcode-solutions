class Solution {
    public int bestClosingTime(String s) {
        
        int penalty = 0;
        for(char c : s.toCharArray()){
            if(c == 'Y') penalty++;
        }

        int minpenalty = penalty ;
        int besthour = 0;

        for(int i =0; i< s.length() ; i++){
            if(s.charAt(i) == 'Y'){
                penalty--;
            }else{
                penalty++;
            }


            if(penalty < minpenalty){
                minpenalty = penalty;
                besthour = i+1;
            }
        }

       
        return besthour;
    }
    
}