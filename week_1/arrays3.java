class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int size = A.length;
        for (int i = 0; i < size ;i++) {
            int j = 0;
            int r = A[i].length-1;
            while(j <= r){
                int tmp = A[i][j];
                A[i][j]=A[i][r]^1;
                A[i][r]=tmp^1;
                j++;
                r--;
            }

        }
       return A;
    }
}
