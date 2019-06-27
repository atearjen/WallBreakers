class Solution {

    public int findComplement(int num) {
        int len = Integer.toBinaryString(num).length();
        int max = Integer.MAX_VALUE;
        while(len<31) {
            max >>= 1;
            len++;
        }
        return num^max;
    }

}
