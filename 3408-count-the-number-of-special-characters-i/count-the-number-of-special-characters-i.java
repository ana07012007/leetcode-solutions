class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character , Integer> map = new HashMap<>();
        int ans = 0;

        for(char c: word.toCharArray()){
            if(Character.isLowerCase(c)){
                map.put(c , 1);
            }
        }

        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c) && map.containsKey(Character.toLowerCase(c))){
                ans++;
                map.remove(Character.toLowerCase(c));
            }
        }
        return ans;
    }
}