class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int i = 0;
        int j = B.length - 1;
        for (int x = 0; x < A.length; x++) {
            if (A[x] % 2 == 0) {
                B[i] = A[x];
                i++;
            } else {
                B[j] = A[x];
                j--;
            }
        }
        return B;
    }
}
