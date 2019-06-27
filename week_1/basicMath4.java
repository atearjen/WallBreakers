class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        int j = 0;
        for(int i= s.length() -1 ; i >= 0 ; i--){
            int weight = (int)Math.pow(26,j);
            int character = s.charAt(i) - 'A' + 1;
            result = result + (weight * character);
            j++;
        }
        return result;
    }
}
