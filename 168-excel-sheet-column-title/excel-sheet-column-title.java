class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        while(columnNumber>=1){
            if(columnNumber<=26){
                builder.insert(0,(char)('A' + columnNumber -1));
                break;
            }
            else{
                int num = columnNumber%26;
                if(num == 0){
                    builder.insert(0,'Z');
                    columnNumber/=26;
                    columnNumber--;
                }
                else{
                    builder.insert(0,(char)('A' + num -1));
                    columnNumber/=26;
                }
                
            }
        }
        

        return builder.toString();
    }
}