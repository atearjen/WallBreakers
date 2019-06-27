class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        int counter = 0;
        double power = 0;
        while((int)power < n) {
            power = Math.pow(2, counter);
            if ((int)power == n) {
                return true;
            }
            counter++;
        }
        return false;
    }
}
