package Medium;

/* https://leetcode.com/problems/search-a-2d-matrix/ */

public class search_2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;i++) {
                if (matrix[i][j]==target) {
                    return true;
                }
            }
        }
        return false;
    }
}
