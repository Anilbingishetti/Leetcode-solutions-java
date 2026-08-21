class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) return mat;

        int ans [][] = new int [r][c];
        int count = 0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                ans[count/c][count%c] = mat[i][j];
                count++;
            }
        }
        return ans;
    }
}