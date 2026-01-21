class Solution {
    public boolean isSameAfterReversals(int num) {
        // int temp = num;
        // int reverse = reverse(num);
        // reverse = reverse(num);
        // if(reverse == temp){
        //     return true;
        // }else{
        //     return false;
        //}

        if(num == 0) return true;

        return num%10 != 0;
    }

    // static int reverse(int num){
    //     int temp = 0;
    //     while(num >0){
    //         int digit = num%10;
    //         temp = (temp*10) + digit;
    //         num/=10;
    //     }

    //     return temp;
    // }
}