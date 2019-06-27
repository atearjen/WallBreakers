class Solution {
    public int[][] transpose(int[][] A) {
        int xSize = A[0].length;
        int ySize = A.length;
        int[][] B = new int[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize;j++) {
                B[i][j] = A[j][i];
            }
        }
        return B;
    }
}
