public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] sub = new int[row][col];
        int max = 0;
        for (int i = 0; i < row; i++) {
            sub[i][0] = Character.getNumericValue(matrix[i][0]);
            max = Math.max(dp[i][0], max);
        }
        for (int j = 0; j < col; j++) {
            sub[0][j] = Character.getNumericValue(matrix[0][j]);
            max = Math.max(dp[0][j], max);
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == '1') {
                    sub[i][j] = Math.min(sub[i - 1][j - 1], Math.min(sub[i - 1][j], sub[i][j - 1])) + 1;
                    max = Math.max(max, sub[i][j]);
                }else {
                    sub[i][j] = 0;
                }
            }
        }
        
        return max * max;
    }
}
